package loop;

// 반복문 : for, while, do-while
// 반복적으로 실행해야하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx3 {
    public static void main(String[] args) {
        
        int sum = 0;
        // 1~10까지의 합을 구하시오
        for (int i = 0; i < 11; i++) {
            
            sum += i;
            // sum = sum + i
        }

        System.out.println("총합 : "+sum);

        // 1~100까지의 수 중에서 3의 배수 출력
        for (int i = 0; i < 101; i++) {
            if (i%3==0) {
                System.out.print(i + "\t");
            }
        }


    }
}




