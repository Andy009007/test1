package com.yunqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo2 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
        String y1 = " 08:32 ";
        String y2 = "08:33";
        String y3 = "08:30:00";
        String y4 = "入职第一天";

        try {
            Date parse = sdf.parse(y1);
            Date parse2 = sdf.parse(y2);
            Date parse3 = sdf2.parse(y3);
            Date parse4 = sdf2.parse(y4);
            System.out.println(parse4);

            long time = parse.getTime();
            long time1 = parse2.getTime();
            long time3 = parse3.getTime();
            long s=time1-time;
            long s2=time3-time1;
            System.out.println(s2);
            System.out.println(s2/60000);
            System.out.println("======================");
            System.out.println(getType(s2));


            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);






            /*// 获取开始年份和开始月份
            int startYear = calendar.get(Calendar.YEAR);
            int startMonth = calendar.get(Calendar.MONTH);
            // 获取结束年份和结束月份
            calendar.setTime(endDate);
            int endYear = calendar.get(Calendar.YEAR);
            int endMonth = calendar.get(Calendar.MONTH);
            System.out.println(startYear);
            System.out.println(startMonth);
            System.out.println(endYear);
            System.out.println(endMonth);*/

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    private static String getType(Object a) {
        return a.getClass().toString();

    }

}
