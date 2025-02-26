package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        
        // 변수 두개 선언
        int a = 10, b = 4;

        //  +,  -,  *, /
        System.out.printf("%d + %d = %d \n", a, b, a+b); // 4
        System.out.printf("%d - %d = %d \n", a, b, a-b); // 6
        System.out.printf("%d * %d = %d \n", a, b, a*b); // 40
        System.out.printf("%d / %d = %d \n", a, b, a/b); // 2 // java에서 나눗셈은 몫만 나옴, 나머지 값은 처리 안됨. 
        // 소수점 float, double >> a/(float)b == 10/4.00000
        // a(int) / b(float) : 타입이 다른경우 연산 시 큰 쪽으로 변환.
        System.out.printf("%d / %f = %f \n", a, (float)b, a/(float)b); // 2.500000


    }
}
