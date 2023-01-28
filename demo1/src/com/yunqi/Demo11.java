package com.yunqi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo11 {
    public static void main(String[] args) {

        //在日期上作加减(年月日)
       /* Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH, -1);
        rightNow.add(Calendar.DAY_OF_YEAR, -1);
        rightNow.add(Calendar.YEAR, -1);
        Date dt1 = rightNow.getTime();


        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH, -1);
        rightNow.add(Calendar.DAY_OF_YEAR, -1);
        rightNow.add(Calendar.YEAR, -1);
        Date dt2 = rightNow.getTime();


        System.out.println(sdf.format(date));
        System.out.println(sdf.format(dt1));
        System.out.println(sdf.format(dt2));*/


        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //今天的日期
        Date toaday = new Date();
        //1个月之前的日期
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(toaday);
        calendar1.add(Calendar.MONTH, -1);
        Date lastMonth = calendar1.getTime();
        //3个月之前的日期
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTime(toaday);
        calendar0.add(Calendar.MONTH, -3);
        Date threeMonth = calendar0.getTime();
        //6个月之前的日期
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(toaday);
        calendar2.add(Calendar.MONTH, -6);
        Date sixMonth = calendar2.getTime();
        //1年之前的日期
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(toaday);
        calendar3.add(Calendar.YEAR, -1);
        Date lastYear = calendar3.getTime();
        //3年之前的日期
        Calendar calendar4 = Calendar.getInstance();
        calendar4.setTime(toaday);
        calendar4.add(Calendar.YEAR, -3);
        Date threeYear = calendar4.getTime();
        //1个月之后的日期
        Calendar calendar5 = Calendar.getInstance();
        calendar5.setTime(toaday);
        calendar5.add(Calendar.MONTH, 1);
        Date oneFutureMonth = calendar5.getTime();
        //3个月之后的日期
        Calendar calendar6 = Calendar.getInstance();
        calendar6.setTime(toaday);
        calendar6.add(Calendar.MONTH, 3);
        Date threeFutureMonth = calendar6.getTime();
        //6个月之后的日期
        Calendar calendar7 = Calendar.getInstance();
        calendar7.setTime(toaday);
        calendar7.add(Calendar.MONTH, 6);
        Date sixFutureMonth = calendar7.getTime();
        //1年之后的日期
        Calendar calendar8 = Calendar.getInstance();
        calendar8.setTime(toaday);
        calendar8.add(Calendar.YEAR, 1);
        Date oneFutureYear = calendar8.getTime();
        //3年之后的日期
        Calendar calendar9 = Calendar.getInstance();
        calendar9.setTime(toaday);
        calendar9.add(Calendar.YEAR, 3);
        Date threeFutureYear = calendar9.getTime();

        System.out.println(sdf.format(toaday));
        System.out.println(sdf.format(lastMonth));
        System.out.println(sdf.format(threeMonth));
        System.out.println(sdf.format(sixMonth));
        System.out.println(sdf.format(lastYear));
        System.out.println(sdf.format(threeYear));
        System.out.println(sdf.format(oneFutureMonth));
        System.out.println(sdf.format(threeFutureMonth));
        System.out.println(sdf.format(sixFutureMonth));
        System.out.println(sdf.format(oneFutureYear));
        System.out.println(sdf.format(threeFutureYear));

    }
}
