package oop;

public class Singleton {
    // 객체를 하나만 만들게 하는 방법 : singleton
    private static Singleton singleton = new Singleton();

    // 생성자. - 클래스명과 동일
    private Singleton() {

    }

    static Singleton getInstance() {
        return singleton;
    }

}
