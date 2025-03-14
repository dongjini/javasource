package api.util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {
    // 한 어린이의 키를 2015 ~ 2024년 사이에 1년 단위로 입력밥기
    // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
    // 입력 예시 : 120 122 125 130 139 160 169 173 175

    public static void main(String[] args) {
        // List<LocalDate> yearList = new ArrayList<>();
        // List<String> list = new ArrayList<>();
        // list.add("120");
        // list.add("122");
        // list.add("125");
        // list.add("130");
        // list.add("139");
        // list.add("160");
        // list.add("169");
        // list.add("173");
        // list.add("175");

        // for (int i = 2015; i <= 2024; i++) {
        // yearList.add(LocalDate.of(i, 1, 1));
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("10년 동안의 키를 입력해 주세요");
        System.out.print(" >> ");
        String input = sc.nextLine();

        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        // 가장 많이 키가 큰 년도와 cm 출력
        int diff = 0;
        int pos = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int sub = list.get(i + 1) - list.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }
        }
        System.out.println("키가 가장 많이 자란 년도는 " + (pos + 2015) + " 년, 키는" + diff + " cm");

        sc.close();

    }

}
