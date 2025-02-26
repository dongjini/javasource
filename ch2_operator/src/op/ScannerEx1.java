package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        // 키보드로 입력
        // System.in : 키보드, System.out : 화면
        Scanner scanner = new Scanner(System.in);  // 키보드로 입력받는 코드

        System.out.println("두자리 정수 입력");
        //  사용자가 입력한 값을 input 변수에 담기
        //  nextLine() : 문자열로 받아옴
        String input = scanner.nextLine();

        //  "45" ==> 45 (문자열을 정수로 바꿈)
        int num = Integer.parseInt(input);  // 문자열을 정수로 바꾸고 싶을때 무조건 이 코드.

        System.out.println("입려값 : " +num );

        scanner.close();
    }
}
