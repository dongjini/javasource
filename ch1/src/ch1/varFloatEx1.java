package ch1;

public class varFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float, double
        //  Java에서 소수점 형태의 숫자를 사용하면 무조건 double로 인식
        //  float(4byte) = double(8byte) ==> x 
        //  float 타입은 f, F를 붙임
        float score1 = 90.14F;
        //  double 타입도 d, D를 붙임(안헷갈릴려고)
        double score2 = 98.5D;

        System.out.println("score1 = " +score1);
        System.out.println("score2 = " +score2);
        // 소수점 2째짜리까지 표현 (%.2f)
        System.out.printf("score2 = %.2f \n" , score2);
    
    }
}
