package com.yunqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DDDDD {
    public static void main(String[] args) {

        String dateTime="2022-12-30";
        Integer expire=1;
        Calendar calendar=Calendar.getInstance();
        Date date=null;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try{
            date=simpleDateFormat.parse(dateTime) ;
        }catch(ParseException e){
            System.out.println("String =>Date格式转换失败");
        }
        calendar.setTime(date);
        //自然月的计算规则,2020-12-15发放,有效期1个月,那过期时间是12月31号
        calendar.add(Calendar.MONTH,expire-1);
        //getActualMaximum(Calendar.DAY_OF_MONTH) 得到了31天
        calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        //获得当月的最后一天日期 2020-12-31
        String endDate=simpleDateFormat.format(calendar.getTime());
        System.out.println(endDate);
    }
}
