package oop;

public class Calc {
    // 사칙연산
    long add(long num1, long num2) {
        return num1 + num2;
    }

    long subtract(long num1, long num2) {
        return num1 - num2;
    }

    long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    // long 타입의 입력 값 2개 3, 5
    // 출력 : 큰 숫자 5
    long max(long num1, long num2) {
        // 삼항연산자 (조건 ? 참 : 거짓;)
        // if (num1 > num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 > num2 ? num1 : num2;

    }

    long min(long num1, long num2) {

        // if (num1 < num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 < num2 ? num1 : num2;
    }
}
