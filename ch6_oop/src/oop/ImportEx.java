package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.*; // Math 안 요소들이 static 이기 떄문에 가능

// import 사용하지 않는 패키기(자동으로 import 처리 해줌)
// java.lang.*  (* -> lang 패키지에 속한 모든 클래스 / 별은 전체를 의미)

// import 문
// 다른 패키지의 클래스 사용할 때
import extend.Parent;

public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date); // Fri Mar 07 16:40:57 KST 2025

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : hh.mm.ss");
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        // Math : static 메소드로 선언됨.
        // System.out.println(Math.min(15, 25));
        System.out.println(min(15, 25));
        // System.out.println(Math.random());
        System.out.println(random());

        String str;
    }
}
