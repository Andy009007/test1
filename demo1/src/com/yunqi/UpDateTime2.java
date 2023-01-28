package com.yunqi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.util.Date;

public class UpDateTime2 {
    public static void main(String[] args) {

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        LocalTime time = LocalTime.now();
        LocalDate t = LocalDate.parse(sdf.format(today));
        System.out.println(time);
        System.out.println(t);

        System.out.println(t.equals(time));


        System.out.println("--------判断今天是否是你生日---------");
        LocalDate myBir = LocalDate.of(1999, 3, 31);
        LocalDate now = LocalDate.now();
//      MonthDay monthDay = MonthDay.of(myBir.getMonthValue(), myBir.getDayOfMonth());//或者使用from
        MonthDay monthDay = MonthDay.from(myBir);
        MonthDay nowMonthDay = MonthDay.from(now);
        boolean b = monthDay.equals(nowMonthDay);
        System.out.println(myBir);
        System.out.println(now);
        System.out.println(b);
    }
}
