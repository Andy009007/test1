package com.yunqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CCCC {
   /* public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMM");
        String ym = sd.format(today);
        String yearMonth = ym.substring(ym.length() - 4);
        System.out.println(yearMonth);


        String s="WY-2212-0001";

        int i = s.indexOf(yearMonth);
        System.out.println(i);


    }*/


    public void main(String[] args) {
        String s = calculateEndDate("2020-12-15", 1);
        System.out.println(s);
    }
    /**
     @param dateTime: 发放生效日期2020-12-15
     @param expire：有效期 1个月
     @return: 获得失效日期 即当月的最后一天, 入参是2020-12-15,它所在的月的最后一天是31号
     */

    private String calculateEndDate(String dateTime,int expire){
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
        return endDate;
    }

}
