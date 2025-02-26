package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
        
        byte a = 10, b = 4; 
        // java에선 byte, short은 연산시 결과가 int로 변환됨.
        
        int c = a + b; // 해결책 1
      //  byte c = (byte)(a+b); // 해결책 2 (결과값이 -127 ~ 127사이일 경우)
        

    }
}
