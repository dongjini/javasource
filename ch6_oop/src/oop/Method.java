package oop;

// 메소드 : 리턴타입 메소드명(){} /메소드만 있는 클래스도 잇음. / 기능을 가지고 있음.
// 리턴(반환) 타입 : 기본타입(정수형, 불린형, 문자형, 실수형), 객체타입(대문자로 시작), 배열, void(리턴타입 없음)

public class Method {

    int method1() {

        int sum = 15;

        // return 0;
        return sum; // 선언한 변수로 리턴값을 줘도 됨.
    }

    String method2() {

        String str = "Hello";

        // return "";
        // return null; // (객체타입)
        return str;
    }

    double method3() {

        return 0.0;
    }

    char method4() {
        return ' ';
    }

    void method5() {
        // return; // 넣기도하나 옆에 뭘 안 넣어도됨, 안넣어도 문제 없음
    }

    // 매개변수가 있는 메서드
    // 매개변수 : 기본타입(정수형, 불린형, 문자형, 실수형), 객체(대문자로 시작), 배열
    // 개수 상관업음 1 ~ + +
    int add(int x, int y) {
        return x + y; // 출력을 뭘 할거냐란 뜻
    }

    float add2(int x, float y) {
        // float + int = float
        return x + y; // 리턴 옆에는 하나만 올 수 있음, 결과가 하나임
    }

    void print(String name, String id) { // 출력은 없는데 입력은 있음
        System.out.println(name + ": " + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }

}
