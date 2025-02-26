package op;

// 문자열 : "ㅁ", "abc"

public class CompareEx3 {
    public static void main(String[] args) {
        
        // 변수선언 : 기본타입(ch1 - VaByteEx1 참조)
        // 자바에서 문자열은 기본타입으로 선언하지 않는다. 객체타입으로 선언
        String str1 = "abc"; // str1(str2) 을 저장하는 공간과 str3 을 저장하는 공간이 다름.
        String str2 = "abc";
        String str3 = new String("abc"); // 객체타입을때는 이 방식이 정석(new)

        // 같은 공간에서 저장된 문자열 비교시 == 을 사용(값 비교)하면 true
        // 다른 공간(다른 객체)에서 저장된 문자열 비교시 == 을 사용(주소 비교) -- 같은 문자열이라도 주소값이 달라서 false
        // == 은 주소비교의 개념.

        System.out.printf("str1 == str2 = %b \n", (str1 == str2)); // true
        System.out.printf("str1 == str3 = %b \n", (str1 == str3)); // false
        // 문자열 비교 == 대신에, equals(), equalsIgnoreCase() 사용
        // abc == ABC : false , 그러나 equalsIgnoreCase()사용하면 대소문자 구분하지말고 비교 
        System.out.printf("str1.equals(str3) = %b \n", (str1.equals(str3))); 
        System.out.printf("str1.equals(ABC) = %b \n", (str1.equals("ABC"))); 
        System.out.printf("str1.equalsIgnoreCase(str3) = %b \n", (str1.equalsIgnoreCase(str3)));
        System.out.printf("str1.equalsIgnoreCase(ABC) = %b \n", (str1.equalsIgnoreCase("ABC")));

    }
}
