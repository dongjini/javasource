package condition;

import java.util.Scanner;

public class IfTest4 {
    public static void main(String[] args) {
        // score >= 90 등급은 A입니다. 출력 if
        // score >= 80 등급은 B입니다. 출력 else if
        // score >= 70 등급은 C입니다. 출력
        // score >= 60 등급은 D입니다. 출력
        // score < 60 등급은 F입니다. 출력
        // score를 입력을 받아
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");

        String input = scanner.nextLine();
        int score = Integer.parseInt(input);
        
        
        if (score >= 90) {
            System.out.println("등급은 A입니다.");
            
        } else if (score >= 80) {
            System.out.println("등급은 B입니다.");

        } else if (score >= 70) {
            System.out.println("등급은 C입니다.");

        } else if (score >= 60) {
            System.out.println("등급은 D입니다.");

        } else {
            System.out.println("등급은 F입니다.");

        } 

        scanner.close();
    }
}
