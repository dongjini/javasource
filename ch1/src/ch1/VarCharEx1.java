package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 문자: 글자 한개 => 'a', '미', ' '              /공백도 따음표 주면 됨.
        // 문자열: 글자 한개 ~ 여러개 => "미", "a", "axc", " "
        // 문자 > 숫자 (인코딩), 숫자 > 문자(디코딩)

        // '기'라는 문자를 ch1에 대입
        char ch1 = '기';
        // ch1의 값을 unicode 변수에 대입
        // int = char (문자는 무조건 숫자로 변경<야속된 숫자 unicode>되기 떄문에 char를 int에 담을 수 있다)
        int unicode = ch1;

        System.out.println("ch1 = " +ch1);
        System.out.println("unicode = " +unicode); //'기' 문자의 unicode 값 44592
        
        char ch2 = 'a';
        unicode = ch2;
        System.out.println("ch2 = " +ch2);
        System.out.println("unicode = " +unicode); // 'a' 의 값 97
            
        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = " +ch3);
        System.out.printf("ch3 = %c\n",ch3);
        System.out.println("unicode = " +unicode); // 'A' 의 값 65
        
    }
    
}
