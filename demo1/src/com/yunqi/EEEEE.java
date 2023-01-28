package com.yunqi;

public class EEEEE {

    public static void main(String[] args) {
        String aa="入职";
        String bb="入职第一天";

        boolean contains = bb.contains(aa);
        System.out.println(contains);


        String[] split = "入职第一天".split("\n");

        System.out.println(split[0]);



    }
}
