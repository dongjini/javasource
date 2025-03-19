package oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("홍길동");
        p1.setPno("123");
        p1.setTel("010-1234-1234");
        System.out.println(p1); // Person(pno=123, name=홍길동, tel=010-1234-1234)

        Person p = new Person(null, null, null);

        Person2 p2 = new Person2();
        p2 = new Person2(null); // @RequiredArgsConstructor, @NotNull + private String name

        Person2 person2 = Person2.builder() // 객체를 생성하는 또다른 인스턴스 방법
                .pno("4567")
                .name("성춘향")
                .tel("010")
                .build();

    }
}
