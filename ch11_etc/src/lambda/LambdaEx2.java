package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t);
        // 숫자를 전달인자로 받아 출력하기
        Consumer<Integer> consumer = (i) -> System.out.println(i); // Consumer(객체 1개)받은걸 소비하는 개념.
        consumer.accept(50);

        // 문자를 전달인자로 받아 출력 // 안녕하세요
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("안녕하세요");

        // BiComsumer -> 객체 2개 받음 hellobye
        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("hello", "bye");

        // DoubleConsumer -> 기본형 더블 타입으로 받음. 15.2
        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(15.2);

        // LongConsumer, IntConsumer

        // hello 11.1
        ObjDoubleConsumer<String> objDoubleConsumer = (t, value) -> System.out.println(t + " " + value);
        objDoubleConsumer.accept("hello", 11.1);

        // Math.random() : 1~6 리턴
        // 공급 - T get()
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

    }

}
