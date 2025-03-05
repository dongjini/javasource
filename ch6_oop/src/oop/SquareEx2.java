package oop;

import java.util.Arrays;

public class SquareEx2 {
    public static void main(String[] args) {
        Square square = new Square(20);

        System.out.println("면적은 : " + square.area());

        // 타입 배열명 = new 타입[개수];
        // 타입 배열명 = { };
        // 객체 배열
        // 개체명(클래스명) 배열명 = new 개체(클래스명)[개수];

        Square sqArr[] = new Square[5];
        System.out.println(Arrays.toString(sqArr)); // [null, null, null, null, null]
        sqArr[0] = new Square(15);
        System.out.println("첫번째 면적: " + sqArr[0].area());

        // 객체배열 초기화
        // sqArr[0] = new Square(); // sideLength = 0
        // sqArr[1] = new Square();
        // sqArr[2] = new Square();
        // sqArr[3] = new Square();
        // sqArr[4] = new Square();

        for (int i = 0; i < sqArr.length; i++) {
            sqArr[i] = new Square();
        }

        // sideLength 값 부여
        sqArr[0].sideLength = 35;
        sqArr[1].sideLength = 15;
        sqArr[2].sideLength = 10;
        sqArr[3].sideLength = 3;
        sqArr[4].sideLength = 20;

        for (int i = 0; i < sqArr.length; i++) {
            System.out.printf("%d 번째 면적: %d \n", (i + 1), sqArr[i].area());

        }

    }
}
