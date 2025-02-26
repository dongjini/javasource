package op;


public class CompareEx2 {
    public static void main(String[] args) {
        float f1 = 0.1f;
        double d1 = 0.1;
        double d2 = (double)f1;

        //  19.17f : 19자리로 표현. 소수점 17자리까지 나오게
        System.out.printf("10.0 == 10.0f %b\n", 10.0==10.f); // true
        System.out.printf("0.1 == 0.1f %b\n", 0.1==0.1f);  // false  --- 0.1(double타입)
        System.out.printf("f1 = %19.17f\n", f1);  // 0.10000000149011612(float)
        System.out.printf("d1 = %19.17f\n", d1);  // 0.10000000000000000(double)
        System.out.printf("d2 = %19.17f\n", d2);  // 0.10000000149011612
        System.out.printf("f1 == d1 %b\n", f1 == d1); // false
        System.out.printf("d1 == d2 %b\n", d1 == d2); // false
        System.out.printf("d2 == f1 %b\n", d2 == f1); // true
        System.out.printf("(float)d1 == f1 %b\n", (float)d1 == f1); // true
        
        // 실수를 오차없이 저장할 수 있는거는 double, 자바에서 기본값이 double (안전) 
    
    }
}
