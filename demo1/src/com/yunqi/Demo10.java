package com.yunqi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo10 {

    public static void main(String[] args) {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();


        Calendar rightNow=Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.YEAR,1);
        rightNow.add(Calendar.DAY_OF_YEAR,1);
        Date time = rightNow.getTime();

        System.out.println(sdf.format(date));
        System.out.println(sdf.format(time));


        String a="法定假[3.15]";
        String substring = a.substring(4, a.length() - 1);

        System.out.println(substring);





    }
}
