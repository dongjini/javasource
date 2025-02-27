package condition;

import java.util.Scanner;

public class IfTest8 {
    public static void main(String[] args) {
        // 임금 구하기

        
        int rate = 9800;  // 시급
        int pay;
    

        // 근무시간을 입력받아 hours 변수에 담기.

        // 근무시간이 8시간 까지는 시간당 임금을 지불.
        // 8시간 초과 근무 시 시간당 임금의 1.5배를 지급.
        // 임금 계산 후 pay변수에 담기.

        // 최종 출력 : "받는 임금은 120000입니다."

        Scanner scanner = new Scanner(System.in);
        System.out.println("근무시간 입력");

        String input = scanner.nextLine();
        int hours = Integer.parseInt(input);
            
        if (hours <= 8) {

            pay = rate*hours;
            System.out.printf("받는 임금은 %d 입니다" , pay);

        } else {

            pay = 8*rate + (int)((hours-8)*1.5*rate);
            System.out.printf("받는 임금은 %d 입니다.", pay);

        }


    }
}
