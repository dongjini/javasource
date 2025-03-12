package exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("입력 >>  ");

        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("문자를 입력했는지 확인해 주세요.");
        } finally { // 예외가 발생해도 finally 구문은 실행 후 멈춤
            System.out.println("무조건 실행");
        }

        try {
            int num[] = new int[1];
            System.out.println(num[3]);
        } finally {
            System.out.println("여기도 무조건 실행");
        }

        sc.close();
    }
}
