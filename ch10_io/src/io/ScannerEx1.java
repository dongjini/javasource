package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream
        // 2) Scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력");
        int num1 = sc.nextInt(); // nextInt() ;줄단위로 못 읽고 넘어감.
        System.out.println("연산자 입력 (*, +, /, -)");
        // String op = sc.nextLine(); // nextLine() 줄 단위로 읽음.
        String op = sc.next();
        System.out.println("숫자 입력");
        int num2 = sc.nextInt();

        // sc.next();
    }
}
