package array;

import java.util.Arrays;

// 배열

// 같은 타입의 여러 번수를 하나의 묶음으로 다루는 개념
// 배열의 크기는 변경이 불가.

public class ArrayEx2 {
    public static void main(String[] args) {

        // 길이가 10인 int형 배열을 생성
        int[] arr = new int[10]; // int arr[] 배열 대괄호가 뒤에와도 ㄱㅊ

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10;
        }

        // 배열 요소의 값 확인
        // 1) for 문 사용 : 원하는 형태로 출력 가능
        // 2) 항상된 for 문 : 1) 번과 같음
        // 3) Arrays.toString(배열명) : [배열요소 출력] => 확인용
        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // 항상된 for의 단점, index 사용 못함
        int idx = 0;
        for (int i : arr) {
            System.out.print(++idx + " : " + i + "\n");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " : " + arr[i] + "\n");
        }

    }
}
