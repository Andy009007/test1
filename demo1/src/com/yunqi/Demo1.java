package com.yunqi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        String a="病假[3.15]";
        String b="病假";
        String c="08:57   \n17:32";

        //System.out.println(c.length());

        //System.out.println(a.equals(b));

        //System.out.println(a.indexOf(b));
        //System.out.println(c);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        String[] split = c.split("  \n");
        //System.out.println(split[0]);
        //System.out.println(split[1]);
        Date parse = sdf.parse(split[0]);
        String format = sdf.format(parse);
        //System.out.println(format);


        /*String[] split1 = a.split("]");
        System.out.println(split1[0]);
        String[] split2 = split1[0].split("[");
        System.out.println(split2[0]);
        System.out.println(split2[1]); */

        //String substring = a.substring(3, a.length() - 1);
        //System.out.println(substring);

        /*int d=6;
        Float f=new Float(2);
        Float g=new Float(2);
        //f= Float.valueOf(d);
        f= 6.66f;
        g= 6.66f;
        f=f+g;
        System.out.println(f);*/

    }




}
