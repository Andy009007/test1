package com.yunqi;
 
import java.time.*;
 
public class UpDateTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
 
        LocalTime time1 = time.minusHours(1);
        System.out.println(time1);
        LocalTime time2 = time.minusMinutes(1);
        System.out.println(time2);
        LocalTime time3 = time.minusSeconds(1);
        System.out.println(time3);
        LocalTime time4 = time.minusNanos(1);
        System.out.println(time4);
 
        LocalTime time11 = time.plusHours(1);
        System.out.println(time11);
        LocalTime time22 = time.plusMinutes(1);
        System.out.println(time22);
        LocalTime time33 = time.plusSeconds(1);
        System.out.println(time33);
        LocalTime time44 = time.plusNanos(1);
        System.out.println(time44);
 
        LocalDate nowDate = LocalDate.now();
        LocalDate myDate = LocalDate.of(2022, 3, 30);
        System.out.println("今天是2022-3-30？"+myDate.equals(nowDate));
        String s = myDate.isAfter(nowDate) ? "我的生日没到" : "我的生日过了";
        System.out.println(s);
 
        System.out.println("--------判断今天是否是你生日---------");
        LocalDate myBir = LocalDate.of(1999, 3, 31);
        LocalDate now = LocalDate.now();
//      MonthDay monthDay = MonthDay.of(myBir.getMonthValue(), myBir.getDayOfMonth());//或者使用from
        MonthDay monthDay = MonthDay.from(myBir);
        MonthDay nowMonthDay = MonthDay.from(now);
        boolean b = monthDay.equals(nowMonthDay);
        System.out.println(b);
 
    }
}