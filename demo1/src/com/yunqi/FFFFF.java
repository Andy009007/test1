package com.yunqi;

import java.math.BigDecimal;

public class FFFFF {

    public static void main(String[] args) {

        String aa="代理研究院相关业务。\n" +
                "【依法须经批准的项目，经相关部门批准后方可开展经营活动】";

        aa = aa.replaceAll("\\n", "");

        System.out.println(aa);


        BigDecimal s=new BigDecimal(3.000);
        BigDecimal a=new BigDecimal(0.00);
        BigDecimal d=new BigDecimal(0.0);

        int i = s.compareTo(BigDecimal.ZERO);
        System.out.println(i);


    }
}
