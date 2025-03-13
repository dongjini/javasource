package api.string;

import java.util.Arrays;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        // String 원본 문자열 변경 불가이기 때문에 매번 기존의 메모리를 해제하고 재생성

        String str1 = "안녕하세요";
        str1 += " 반갑습니다";
        str1 += " 저는 홍길동 입니다.";

        // StringBuffer sb = "안녕하세요"; (x)
        StringBuffer sb = new StringBuffer("안녕하세요.");
        // sb.append(" 반갑습니다.");
        // sb.append(" 저는 홍길동 입니다.");
        sb.append(" 반갑습니다.").append(" 저는 홍길동 입니다.");

        String str2 = new String("Hello");
        String str3 = new String("Hello");
        System.out.println(str2.equals(str3) ? "문자열 같음" : "문자열 다름");

        // StringBuffer equals 확인 - 부모가 상속해준 그대로 사용중
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb1.equals(sb2) ? "문자열 같음 " : "문자열 다름");

        // String equals 사용하기 위해 변환
        // String obj1 = sb1.toString();
        // String obj2 = sb2.toString();
        String obj1 = new String(sb1); // 생성자 이용해ㅓ 받아도 됨
        String obj2 = new String(sb2);
        System.out.println(obj1.equals(obj2) ? "문자열 같음" : "문자열 다름");

        // str1 거꾸로 출력 : charAt(30)
        char chArr[] = new char[str1.length()];
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();
        // str1 StringBuffer 로 변경
        // StringBuffer sb3 = new StringBuffer(str1);
        System.out.println(new StringBuffer(str1).reverse());

        System.out.println("StringBuffer reverse() " + sb.reverse());

        // delete(), insert()
        System.out.println("sb1.delete(0, 2) " + sb1.delete(0, 2)); // end는 포함 안함 / hello -> llo
        System.out.println("sb1.deleteCharAt(0) " + sb1.deleteCharAt(0)); // 원본 변경을 해서 / llo -> lo
        System.out.println(sb1);
        System.out.println("sb1.insert(0, H) " + sb1.insert(0, "H"));

        // replace() : 원본변경x 새로운 문자 넘어옴
        System.out.println("sb1.replace(0, 2, java) " + sb1.replace(0, 2, "java")); // 0,1번 자리를 jave로 바꿈 / hlo-> javao
        System.out.println("원본 sb1 " + sb1);

    }
}
