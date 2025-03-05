package oop;

import java.util.Arrays;

public class SquareEx1 {
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
        // System.out.println("첫번째 면적: " + sqArr[0].area());

        sqArr[1] = new Square(11);
        // System.out.println("두번째 면적: " + sqArr[1].area());

        sqArr[2] = new Square(14);
        // System.out.println("세번째 면적: " + sqArr[2].area());

        sqArr[3] = new Square(5);
        // System.out.println("네번째 면적: " + sqArr[3].area());

        sqArr[4] = new Square(9);
        // System.out.println("다섯번째 면적: " + sqArr[4].area());

        for (int i = 0; i < sqArr.length; i++) {
            System.out.printf("%d 번째 면적: %d \n", (i + 1), sqArr[i].area());

        }

        // 배열 기본타입으로 설정
        // 정수형 - 0, 실수형 - 0.0, 불린형 - false
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]
        arr[0] = 15;
        arr[1] = 10;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 18;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
