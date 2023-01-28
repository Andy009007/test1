package com.yunqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AAAAAA {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdfm = new SimpleDateFormat("yyyy-MM-dd");

        //日期字符串
        String b = "2022-11-06";
        //日期字符串转换为Date格式
        Date parse = sdfm.parse(b);
        //Date格式转为long类型
        long time = parse.getTime();
        //强调:long类型不可直接强转为int类型
        //int intTime = (int) time;

        //long类型转为字符串
        String i = time + "";

        //去除字符串后三位字符
        String substring = i.substring(0, i.length() - 3);

        //打印long类型
        System.out.println(time);
        //打印long类型转为字符串
        System.out.println(i);
        //打印截取之后的字符串
        System.out.println(substring);

        //截取后的字符串转为int类型
        Integer r = Integer.parseInt(substring);
        //int转为long类型
        Long l = r.longValue();
        Date today = new Date();
        //设置时间
        today.setTime(l * 1000);
        //格式化为规定格式
        String format = sdf.format(today);
        //打印设置时间后的日期
        System.out.println(today);
        //打印格式化后的日期
        System.out.println(format);















       /* Date parse = sdfm.parse(b);

        long time = parse.getTime();
        int c= (int) (time/1000);

        System.out.println(c);
        System.out.println(parse);*/






        /*String a = "1663862400";
        Integer i = Integer.parseInt(a);
        Long l = i.longValue();
        Date today = new Date();
        today.setTime(l * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Date date = sdf.parse(a);
        //String format = sdf.format(date);
        String format = sdf.format(today);
        System.out.println(today);
        System.out.println(format);*/
    }
}
