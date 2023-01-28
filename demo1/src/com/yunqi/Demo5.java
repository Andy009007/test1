package com.yunqi;

public class Demo5 {
    public static void main(String[] args) {
        String a="09:10\n19:23";
        String b="08:10  \n19:23";
        String c="08:42  \n17:35";

        String[] split = b.split(" ");
        System.out.println(split.length);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }
}
