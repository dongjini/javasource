package oop;

// 메서드 종류

// 1. 인스턴스 메서드 : 클래스 영역 / 인스턴스가 생성되었을 때 (new Card())
// 2. 클래스 메서드 : 클래스 영역 / 클래스가 메모리에 올라갔을 때 (클래스 작성 완료되면)

// 같은 클래스 내에서 다른 메소드 호출 가능(new 안써도 됨.) - 이름 사용
// 이름만 이용해서 호출(개체생성 안해도 됨)
// but, static이 붙으면 못부름
// static - non static : 생성되는 시기가 다르기 떄무에 호출 시점을 따져야 함 
// static : 같은 static 애들만 호출이 가능
// non static : static, non static 다 사용가능
public class MiniCalc {

    static int k;
    int a, b;

    // 클래스 메서드
    static void print() {
        // plus(), avg(), execute(), println() 아직 생성안되서 호출 불가 => 호출하려면 new MiniCalc() 한
        // 후(잘 사용하진 않음)
        // this.a = 7; => 호출하려면 new MiniCalc()한 후
    }

    int plus(int x, int y) {
        this.a = 7;
        this.k = 10;
        print();
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void excute() {
        double result = avg(7, 10);
        println("실행결과 : " + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }

}
