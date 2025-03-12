package api.string;

public class StringEx1 {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str4 = new String("Hello");
        String str2 = "Hello"; // 더 많이 씀
        String str3 = "Hello"; // str2번은 할당, str3은 str2의 위치(주소)를 가리킴(재사용)
        char[] charr = { 'H', 'e', 'l', 'l', 'o' };
        String str5 = new String(charr);

        System.out.println("str5 : " + str5);

        System.out.println(str1 == str4); // false
        System.out.println(str2 == str3); // true

        // 문자열 비교 : equals()
        System.out.println(str1.equals(str3));

        // 빈 문자열 / 둘 다 초기화임.
        str1 = "";
        System.out.println(str1.length()); // 빈 문자열도 문자열이라 0 이라 출력
        str2 = null;
        System.out.println(str2.length()); // null은 비어있어서 NullpointException이 뜸

    }

}
