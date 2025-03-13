package api.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:03:02 KST 2025

        // yyyy : 년도 4자리, yy : 년도 2자리
        // MM : 월 2자리
        // dd : 일 2자리
        // hh : 시 (1~12시) / HH (24시 표현)
        // mm : 분
        // ss : 초
        // a : 오전, 오후 표현 (AM/PM)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E 요일", Locale.ENGLISH);
        System.out.println(sdf.format(d));
    }
}
