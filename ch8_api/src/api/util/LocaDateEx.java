package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocaDateEx {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-03-13T14:37:12.665392300

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2025-03-13
        System.out.println("년도 :" + date.getYear());
        System.out.println("월 : " + date.getMonthValue()); // getMonthValue : 1~ 12 / getMonth : oct, dec, ...
        System.out.println("일 : " + date.getDayOfMonth());
        System.out.println("+5일 : " + date.plusDays(5));
        System.out.println("-2달 : " + date.minusMonths(3));

        LocalTime time = LocalTime.now();
        System.out.println(time); // 14:39:23.182017700
        System.out.println("시 : " + time.getHour());
        System.out.println("분 : " + time.getMinute());
        System.out.println("초 : " + time.getSecond());
        System.out.println("+5시간 : " + time.plusHours(5));

    }
}
