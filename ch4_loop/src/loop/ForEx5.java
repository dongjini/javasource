package loop;

// 반복문 : for, while, do-while
// 반복적으로 실행해야하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx5 {
    public static void main(String[] args) {
        // 1~100사이의 숫자 중
        // 1) 3의 배수의 총 합 출력
        // 2) 3의 배수 더하고 9의 배수는 뺸 합 출력
        // 3) 3의 배수와 5의 배수의 총합 출력
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            
            if (i%3==0) {
                sum += i;
            }
            
        }
        System.out.println("3의 배수의 총 합 : "+sum);

        sum= 0;
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 && i%9 != 0) {
                sum += i;
            }
            
        }
        System.out.println("3의 배수이지만 9의 배수는 아닌 수의 총 합 : "+sum);

        sum= 0;
        for (int i = 1; i < 101; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
            
        }
        System.out.println("3의 배수의 총 합과 5의 배수의 총 합 : "+sum);
    }    
}




