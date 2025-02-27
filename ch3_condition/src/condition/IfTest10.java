package condition;

import java.util.Scanner;

public class IfTest10 {
    public static void main(String[] args) {
       
        // 세 개의 숫자를 입력받아 입력받은 수 중 가장 큰 수와 가장 작은 수를 출력

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번쨰 수 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("두 번쨰 수 입력");
        input = scanner.nextLine();
        int num2 = Integer.parseInt(input);

        System.out.println("세 번쨰 수 입력");
        input = scanner.nextLine();
        int num3 = Integer.parseInt(input);

        // if (num1 > num2 && num1 > num3) {                                 //내가한것

        //     System.out.println("가장 큰 수 : " +num1);
            
        //     if (num2 > num3) {
        //         System.out.println("가장 작은 수 : " +num3);
        //     } else {
        //         System.out.println("가장 작은 수 : " +num2);
        //     }
            
            
        // } else if (num2 > num1 && num2 > num3) {

        //     System.out.println("가장 큰 수 : " +num2);

        //     if (num1 > num3) {
        //         System.out.println("가장 작은 수 : " +num3);
        //     } else {
        //         System.out.println("가장 작은 수 : " +num1);
        //     }
            
            
        // } else {

        //     System.out.println("가장 큰 수 : " +num3);

        //     if (num1 > num2) {
        //         System.out.println("가장 작은 수 : " +num2);
        //     } else {
        //         System.out.println("가장 작은 수 : " +num1);
        //     }
            

        // }   

        // 강사님 풀이

        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }

        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max  = num3;
        }

        System.out.printf("가장 큰 수 : %d \n", max);
        System.out.printf("가장 작은 수 : %d \n", min);

    }
}
