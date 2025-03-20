package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        // Member => 남자 멤버의 나이 평균
        List<Menber> menbers = Arrays.asList(
                new Menber("홍길동", Menber.MALE, 30),
                new Menber("홍길동", Menber.FEMALE, 20),
                new Menber("홍길동", Menber.MALE, 45),
                new Menber("홍길동", Menber.FEMALE, 27));

        int age = 0, count = 0;
        for (Menber menber : menbers) {
            if (menber.getGender() == Menber.MALE) {
                age += menber.getAge();
                count++;
            }
        }
        System.out.println("남자 멤버 나이 평균 : " + (age / count));

        // 스트림 처리
        // fileter(Predicate<Member> predicate)
        double ageAvg = menbers.stream()
                .filter((menber) -> menber.getGender() == menber.MALE)
                .mapToInt(Menber::getAge)
                .average()
                .getAsDouble();
        System.out.println("남자 멤버 나이 평균 : " + ageAvg);

    }
}
