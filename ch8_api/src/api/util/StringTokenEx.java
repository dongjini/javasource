package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {
    public static void main(String[] args) {

        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str); // 구분자 없다면 공백 기준으로 분리

        // split() : String[] (배열로 받음)
        System.out.println("String split() : " + Arrays.toString(str.split(" ")));
        // "" -> 문자별로 구별 / " " -> 공백을 주면 단어별로 구별

        // StringTokenizer : String (문자열로 받음)
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        str = "this/is/a/test";
        st = new StringTokenizer(str, "/");
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-*/=()", true);
        // 안주면 : x 100 200 300 2
        // true 주면 : x = 100 * ( 200 + 300 ) / 2
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        String source = "1,김천제,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
        // 1
        // 김천제
        // 100
        // 100
        // 100
        // --------
        // 2

        // st = new StringTokenizer(source, ",|");
        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken());
        // }
        // System.out.println();

        st = new StringTokenizer(source, "|");
        while (st.hasMoreTokens()) {
            String token = st.nextToken(); // 1,김천재,100,100,100
            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens()) {
                System.out.println(st2.nextToken());
            }
            System.out.println("-------------------------");
        }
        System.out.println();

    }
}
