package array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        String[][] words = {
                { "chair", "의자" },
                { "compuer", "컴퓨터" },
                { "integar", "정수" }
        };

        // 01. chair(words[0][0])의 뜻은? 의자
        // 정답입니다. (words[0][1].euqals(사용자 입력값))
        // 02. computer(words[1][0]) 의 뜻은? 의자
        // 틀렸습니다. 정답은 컴퓨터입니다.

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i + 1, words[i][0]);
            String input = sc.nextLine();

            if (input.equals(words[i][1])) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다. 정답은 '" + words[i][1] + "' 입니다.");
            }

        }

    }
}
