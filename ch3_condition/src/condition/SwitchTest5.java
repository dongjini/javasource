package condition;

import java.util.Scanner;

public class SwitchTest5 {
    public static void main(String[] args) {

        // 점수(0 ~ 100) 입력받은 후 점수에 따라 등급 출력
        // 90점 이상 A, 80 B, 70 C, F
        //  90 / 10 = 9 , 100/10 = 10


        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        String input = scanner.nextLine();
        int score = Integer.parseInt(input);
        
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;   
            case 7:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;
        }

        

    }
}
