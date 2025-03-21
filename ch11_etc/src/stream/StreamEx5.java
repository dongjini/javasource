package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "grape", "melon", "watermelon", "banana");

        Stream<String> stream = fruits.stream();
        // peek(Consumer<? super T> action)
        stream.map(s -> s.toUpperCase())
                .peek(s -> System.out.println("확인 : " + s))
                .forEach(s -> System.out.println(s));

        // 하나만 실행 할 거면 람다식 메서드 참조로 사용하면 간편
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream<File> stream2 = Stream.of(
                new File("files1.txt"),
                new File("files2.txt"),
                new File("files3"),
                new File("files4.bak"),
                new File("files5.java"));

        stream2.map(f -> f.getName()) // ["files1.txt", "files2.txt" ,,, ]
                .peek(f -> System.out.print(f + " "))
                .filter(f -> f.indexOf(".") > -1) // "files1.txt", "files2.txt", "files4.bak", "files5.java"
                .peek(f -> System.out.print(f + " "))
                .map(f -> f.substring(f.lastIndexOf(".") + 1)) // txt, txt, bak, java
                .distinct() // txt, bak, java
                .forEach(f -> System.out.println(f));

        // "apple", "grape", "melon", "watermelon", "banana"
        fruits.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        System.out.println();
        fruits.stream().skip(2).limit(2).forEach(System.out::println);

        // 스트림 연결
        String[] arr1 = { "123", "456", "789" };
        String[] arr2 = { "abc", "def", "ghi" };

        // 배열 => 스트림
        // Arrays.stream(arr1);
        Stream<String> stream3 = Stream.of(arr1);
        Stream<String> stream4 = Stream.of(arr2);
        // concat을 이용해 스트림 연결
        Stream<String> newStream = Stream.concat(stream3, stream4);

    }
}
