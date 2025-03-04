package oop;

// OOP(Object Oriented Programming)
// 객체지향언어 : 재사용성이 높다
// 코드의 관리가 용이함
// 신뢰성 높은 프로그램 작성

// 자바의 기본 코드 단위가 > 클래스 : 객체 정의, 설계도, 틀
// 클래스 용도 : 객체 생성

// 객체 : 사물(책상, 의자, 자동차, TV), 개념(수학공식)

// 붕어빵 기계(클래스) - 붕어빵(객체)

// 객체와 인스턴스 혼용해서 사용.
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// 책상은 책상 클래스의 인스턴스다.

public class ClassEx1 {
    public static void main(String[] args) {
        // 인스턴스 생성 (암기)
        // 클래스명 변수명 = new 클래스명(); -> 암기 필수
        Tv tv = new Tv();
        Tv tv2 = new Tv();// new 를 한 순간 heap에 대한 주소가 생김

        // 속성확인
        System.out.println(tv); // 주소값 : oop.Tv@5ca881b5 ==> Tv [size=0, color=null, channel=0, volume=0,
                                // power=false]
        System.out.println(tv2); // 주소값 : oop.Tv@24d46ca6 ==> Tv [size=0, color=null, channel=0, volume=0,
                                 // power=false]

        // 인스턴스 사용
        tv.color = "black";
        tv.channelUp();
        System.out.println("tv 현재채널 : " + tv.channel);
        System.out.println("tv 색상 : " + tv.color);

        // 메소드 : ()가 들어가면 메소드.
        tv2.power(); // 메소드 호출(호출을 하면 메소드 실행)
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }
}
