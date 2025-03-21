package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t);
        // 숫자를 전달인자로 받아 출력하기
        // Consumer(객체1개)받은걸 소비하는 개념.
        // Consumer<Integer> consumer = (i) -> System.out.println(i);
        Consumer<Integer> consumer = System.out::println;
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

        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0인 경우 빈 문자열입니다. 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test("")) {
            System.out.println("빈 문자열 입니다.");
        }

        // 전달인자로 받은 숫자가 짝수인지 테스트한 후, 짝수라면 짝수입니다./ 홀수 입니다. 출력
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        if (predicate2.test(5)) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }

        // T : type, R : return type
        // 숫자를 문자로 반환
        Function<Integer, String> function = (i) -> String.valueOf(i);
        System.out.println(function.apply(50));

        // 2개가 들어와서 하나를 리턴(BiFunction<T, U, R>)
        // 사칙연산
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        System.out.println(biFunction.apply(5, 2));

        biFunction = (x, y) -> x * y;
        System.out.println(biFunction.apply(5, 2));

        biFunction = (x, y) -> x - y;
        System.out.println(biFunction.apply(5, 2));

    }

}
