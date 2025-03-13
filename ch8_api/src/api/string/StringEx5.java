package api.string;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println("AB 문자열 횟수 : " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB 문자열 횟수 : " + count("12345", "AB"));
    }

    public static int count(String src, String target) {
        int count = 0, pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            count++;
            pos += target.length(); // 카운트 된 이후 pos 위치를 새로 잡아주는 것
        }
        return count;
    }

}
