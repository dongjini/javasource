package oop;

import java.util.Arrays;

public class MethodEx1 {
    public static void main(String[] args) {
        // Method 이스턴스 생성
        Method method = new Method();

        // 메서드 호출
        int result = method.add(15, 25);
        System.out.println("result : " + result);

        float result2 = method.add2(35, 45.2f);
        System.out.println("result2 : " + result2);

        System.out.println(method.add(45, 55));

        method.print("홍길동", "s123"); // void는 넘어오는게 없어서 호출만하고 끝난다.

        int arr[] = { 1, 2, 3 };
        int arr2[] = method.arr(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
