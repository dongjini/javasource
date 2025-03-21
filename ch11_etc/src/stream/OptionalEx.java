package stream;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcdef");
        Optional<Integer> optInt = optStr.map(String::length);

        // Optional 객체 값 가져오기 : get()
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        // orElse() : 널일때는 빈문자열 반환.(if문 대신 사용)
        // optStr.orElse("");
        int result = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);
        System.out.println("result : " + result);

        // isPresent() / ifPresent(Consumer)
        Optional.of("456").map(Integer::parseInt)
                .ifPresent(x -> System.out.printf("result2 = %d\n", x)); // 널이 아니면 실행시킴.

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty(); // empty() -> no value
        System.out.println("optInt1 = " + optInt1.isPresent()); // true
        System.out.println("optInt2 = " + optInt2.isPresent()); // false

    }
}
