package loop;

import java.util.Scanner;

//  for, while 과의 차이는 무조건 한번은 실행을 함.(조건검사를 나중에 함)

public class DoWhileEx2 {
    public static void main(String[] args) {

        // 문자 입력받은 후 출력
        // q 입력시 반복문 종료
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요 >>");
        String input ;

        do {
        
            System.out.println("종료를 원하면 q, Q 입력 ");
            System.out.print(">> ");
            input = scanner.nextLine();
            
        } while (input.equalsIgnoreCase("q")); // 문자열은 ==, !=  대신 -> equals, equalsIgnoreCase 사용
        System.out.println("프로그램을 종료합니다.");
 
    }
}
