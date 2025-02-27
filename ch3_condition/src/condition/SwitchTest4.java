package condition;

import java.util.Scanner;

public class SwitchTest4 {
    public static void main(String[] args) {

        // 가위(1), 바위(2), 보(3)
        // 컴퓨터가 내는 가위, 바위, 보 결정
        // 사용자가 내는 가위, 바위, 보 결정

        int computer = (int) (Math.random() * 3) + 1; // 1 ~ 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1), 바위(2), 보(3) 입력");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 컴 : 2(바위) - 1(가위) = 1(컴퓨터)
        // 컴퓨터가 이겼습니다, user가 이겼습니다, 비겼습니다
        switch (user - computer) {
            case 2:
            case -1:
                System.out.println("computer가 이겼습니다. ");
                break;
            case 1:
            case -2:
                System.out.println("user가 이겼습니다. ");
                break;
            case 0:
                System.out.println("비겼습니다. ");
                break;

            default:
                break;
        }

    }
}
