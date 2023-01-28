package com.yunqi;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) throws ParseException {
        Date today =new Date();
        String hirt="2022-04-22";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        long time = today.getTime();
        long time1 = sdf.parse(hirt).getTime();
        float a= (time-time1)/(1000*60*60*24);
        float b= (float) (63.0/365);
        DecimalFormat df=new DecimalFormat("0.00");
        String format = df.format(b);
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time-time1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(format);

    }
}
