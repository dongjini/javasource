package ch1;

// 변수의 유효범위
// {}안에서 선언된 변수는 {} 벗어난 곳에서는 사용 불가
public class ScopeEx1 {
    public static void main(String[] args) {
        int a=100;
        {
            int x = 0;
            System.out.println("x="+x);
            System.out.println("a="+a);
        }
        // System.out.println("x="+x);
        
        System.out.println("a="+a);

        if (a<200) {
            int sum =0;
        }
        // System.out.println(sun);

        for (int i = 0; i < args.length; i++) {
            
        }
        // System.out.println(i);
    }
}
