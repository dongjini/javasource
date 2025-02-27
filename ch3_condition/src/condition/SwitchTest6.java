package condition;

import java.util.Scanner;

public class SwitchTest6 {
    public static void main(String[] args) {

        // 연산자, 피연산자 입력받은 후 계산해서 결과 출력
        // +, -, *, /, %
        // 출력문 : 5 - 3 = 2


        Scanner scanner = new Scanner(System.in);

        System.out.println("연잔자를 입력하세요 (+, -, *, /, %)");
        String op = scanner.nextLine();

        System.out.println("숫자 입력1.");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("숫자 입력2.");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("입력값을 확인해 주세요.");
                System.exit(0); //프로그램 종료
                break;
    
         }
            System.out.printf("%d %s %d = %d", num1, op, num2, result);

         

    }
     
}
