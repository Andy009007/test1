package com.yunqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LianXi {

    public static void main(String[] args) {
        final long MAX_NEXT = 0b11111_11111111_111L;

        long offset = 0;

        System.out.println("结果是"+(MAX_NEXT & offset));


        System.out.println("============================================================");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date date=new Date();
        String format1 = format.format(date);
        try {
            Date parse = format.parse(format1);

            System.out.println(date);
            System.out.println(format1);
            System.out.println(parse);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("============================================================");



        String y1 = "2021-01";

        Date startDate = null; //开始时间 y1 2021-11
        try {
            startDate = new SimpleDateFormat("yyyy-MM").parse(y1);
            Date endDate = new Date();  //结束时间 当前时间  2022-05

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            // 获取开始年份和开始月份
            int startYear = calendar.get(Calendar.YEAR);
            int startMonth = calendar.get(Calendar.MONTH);
            // 获取结束年份和结束月份
            calendar.setTime(endDate);
            int endYear = calendar.get(Calendar.YEAR);
            int endMonth = calendar.get(Calendar.MONTH);
            //

            System.out.println(startYear);
            System.out.println(startMonth);
            System.out.println(endYear);
            System.out.println(endMonth);

            System.out.println("====================");

            String a="csgn022";
            String substring = a.substring(a.length() - 3);
            System.out.println(substring);


        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
