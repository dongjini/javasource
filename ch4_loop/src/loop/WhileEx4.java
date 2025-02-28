package loop;

// 반복문 : for, while, do-while
// 반복적으로 실행해야하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class WhileEx4 {
    public static void main(String[] args) {
        
        // 구구단 출력
        // for (int i = 1; i < 10; i++) {
        //     System.out.printf("7 x %d = %d \n", i, i*7);
        // }

        int i = 1;
        while (i < 10) {
            System.out.printf("7 x %d = %d \n", i, i*7);
            i++;
        }
        
    }
}




