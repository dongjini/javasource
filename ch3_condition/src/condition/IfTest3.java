package condition;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        // score가 90보다 크면 점수가 90정 이상입니다, 등급은 A입니다. 출력
        // score가 90보다 작으면 점수가 90정 미만입니다, 등급은 B입니다. 출력
        // score를 입력을 받아
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");

        String input = scanner.nextLine();
        int score = Integer.parseInt(input);
        
        
        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다");
            System.out.println("등급은 A입니다.");
            
        } else{

            System.out.println("점수가 90점 미만입니다");
            System.out.println("등급은 B입니다.");

        }

        scanner.close();
    }
}
