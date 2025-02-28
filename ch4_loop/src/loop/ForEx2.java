package loop;

// 반복문 : for, while, do-while
// 반복적으로 실행해야하는 코드를 간단하게 처리

// 안녕하세요 10번 출력

public class ForEx2 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.print(i+"   ");
        }
        System.out.println();
        
        for (int i = 10; i > 0; i--) {
            System.out.print(i+"   ");
        }

        System.out.println();

        // 짝수만 출력 1~10

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i+"   ");
            }
        }
        
        System.out.println();

        // i+=2 : i=i+2
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i+"   ");
        }

        // 활용.
        int i = 0;
        for (int j = 0, k = 1; i < args.length; i++) {
            
        }

        // for(;;){

        // }

    }
}
