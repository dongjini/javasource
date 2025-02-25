package ch1;

// 형변환(Casting)
// 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
// char -> int, int -> char, float-> int, int ->float
// 작은 타입에서 큰 타입으로 형변환은 허용
// 큰 타입에서 작은 타입(메모리 공간)은 손실이 발생할 수 있기 때문에 강제 형변환 (Casting)
public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        System.out.println("d = " +d);
        int score = (int)d;
        System.out.println("score = " +score);
        
        int inValue = 10;
        double dbValue = 5.5;

        // int + double => double (큰 타입으로 감)
        int result = inValue + (int)dbValue;
        System.out.printf("result : %d \n", result);
        
        float f1 = 9.1234567f;
        double d1 = 9.1234567d;
        
        // 작은타입은 큰 타입으로 알아서 변환 
        double d2 = f1;
        double result2 = d1 + f1;

        int num = 97;
        char ch1 = (char)num;
        System.out.println(ch1);

    }
}
