package array;

import java.util.Arrays;

public class ArrayEx14 {
    public static void main(String[] args) {
        // 2차원 배열 (행, 열)
        // 타입[][] 배열명 = new 타입[3][3];

        // 값을 알고 있는 경우
        int score[][] = {
                { 100, 92, 51 },
                { 20, 30, 40 },
                { 90, 70, 60 },
                { 76, 88, 80 },
                { 76, 98, 12 },
        };

        System.out.println("번호 국어 영어 수학 총점 평군");
        System.out.println("===============================");

        int korT = 0, engT = 0, mathT = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d", i + 1);
            int sum = 0;
            float avg = 0.0f;

            korT += score[i][0];
            engT += score[i][1];
            mathT += score[i][2];

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]); // 개인별 점수 출력
            }
            avg = sum / (float) score[i].length; // sum / 3.0f
            System.out.printf("%5d %5.1f", sum, avg);
            System.out.println();
        }

        System.out.printf("총점  %3d  %3d  %3d \n", korT, engT, mathT);
        System.out.println("===============================");

    }
}
