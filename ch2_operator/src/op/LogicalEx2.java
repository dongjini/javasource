package op;

import java.util.Scanner;

// 논리연산자 : 비교연산자가 여러개 연결 -> 결과값은 true, false
// x가 4보다 작거나 10보다 크다.
// &&(and), ||(or), !(not)
// &&(and)가 ||(or)보다 우선순위 

// true && true ==> true (둘다 true 여야 true)
// true || false ==> true (둘 중 하나만 true라면 결과값은 true)
// !true ==> false
// !false ==> true
 



public class LogicalEx2 {
    public static void main(String[] args) {
        
        // 사용자로부터 문자를 입려받은 후  / 그 문자가 숫자인지 아니면 영문자인지 판별하는 방법.
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요");

        String input = scanner.nextLine();

        // "abc" => "abc".charAt(0) : a, "abc".charAt(1) : b 
        // charAt(index) : 문자열을 문자로 분해해서 돌려받을 수 있는 메소드.
        // index는 0번부터 시작. 
        char ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.println("입려하신 문자는 숫자입니다.");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다.");
        }

        scanner.close();

    }
}
