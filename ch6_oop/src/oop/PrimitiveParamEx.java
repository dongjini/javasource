package oop;

// static 메서드 : 클래스 메서드

public class PrimitiveParamEx {
    public static void main(String[] args) {
        // main 메서드
        Data d = new Data();
        d.x = 100;
        System.out.println("main() x =  " + d.x);

        change(d.x);
        // 값 복사

        change2(d); // d 를 넘기면 주소가 넘어감, d.x가 넘어가면 값이 넘어감.
        // 주소 복사.

        System.out.println("After change() ");
        System.out.println(d.x);
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();

    }

    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x);
    }

    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }
}
