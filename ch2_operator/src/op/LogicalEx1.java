package op;

// 논리연산자 : 비교연산자가 여러개 연결 -> 결과값은 true, false
// x가 4보다 작거나 10보다 크다.
// &&(and), ||(or), !(not)
// &&(and)가 ||(or)보다 우선순위 
 


// y는 2의 배수 또는 3의 배수이지만, 6의 배수는 아니다. : (y % 2 == 0 || y % 3 == 0) && y % 6 != 0
public class LogicalEx1 {
    public static void main(String[] args) {
        
        int x = 0;
        char ch = ' ';
        
        x = 15;
        System.out.printf("x = %2d, 10 < x && x < 20 = %b\n", x, 10 < x && x < 20);
        // x는 10보다 크고, 20보다 작다 : x > 10 && x <20

        x = 6;
        System.out.printf("x = %2d, x %% 2 == 0 || x%%3 == 0 && x%%6 != 0 = %b \n", x, (x % 2==0 || x%3==0 && x%6!=0));
        // y는 2의 배수 또는 3의 배수 : y % 2 == 0 || y % 3 == 0    

        ch = '1';
        System.out.printf("ch = %c, '0' <= ch && ch < '9' = %b\n", ch, '0' <= ch && ch <= '9');
        // '0' ~ '9' : 사이 숫자인지 확인.

        ch = 'a';
        System.out.printf("ch = %c, 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');
        // 소문자인지 확인.

        ch = 'A';
        System.out.printf("ch = %c, 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');
        // 대문자인지 확인.

        ch = 'q';
        System.out.printf("ch = %c, ch == 'q'|| ch == 'Q' = %b\n", ch, ch=='q' || ch == 'Q');
        // 소문자 q 이거나 대문자 Q 인지 확인.
        System.out.printf("ch = %c, !(ch == 'q'|| ch == 'Q') = %b\n", ch, !(ch=='q' || ch == 'Q'));

    }
}
