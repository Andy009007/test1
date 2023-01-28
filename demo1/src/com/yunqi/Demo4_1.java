package com.yunqi;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_1 {
    public static void main(String[] args) throws ParseException {
        //Date today =new Date();
        String start ="2022-04-01";
        String end="2022-06-29";

        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");

        String format = sdf.format(today);
        System.out.println(format+"1111111111");


      /*  Date time1 = sdf.parse(start);
        Date time2 = sdf.parse(end);

        long ms=time2.getTime()-time1.getTime();

        int day = (int) (ms/(60000*60*24));
        int month =day/30;

        System.out.println("time1:"+time1);
        System.out.println("time2:"+time2);
        System.out.println("ms:"+ms);
        System.out.println("day:"+day);
        System.out.println("month:"+month);

*/
      /*  long time1 = sdf.parse(hirt).getTime();
        float a= (time-time1)/(1000*60*60*24);
        float b= (float) (63.0/365);
        DecimalFormat df=new DecimalFormat("0.00");
        String format = df.format(b);
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time-time1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(format);*/

    }
}
