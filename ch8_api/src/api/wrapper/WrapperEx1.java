package api.wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        Integer i = 10; // 객체로 다루는거라 메서드를 불러다가 쓸 수 있음
        // int j = 10;

        System.out.println("String 숫자 => int : " + Integer.parseInt("10"));
        System.out.println("int => String 숫자 : " + i.toString());
        System.out.println("(5, 8) max : " + Integer.max(5, 8));
        System.out.println("(5, 8) min : " + Integer.min(5, 8));

    }
}
