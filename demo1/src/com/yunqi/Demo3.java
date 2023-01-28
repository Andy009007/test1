package com.yunqi;

public class Demo3 {
    public static void main(String[] args) {
        int a=0;
        a=add(a);
        a=add(a);
        a=add(a);
        a=add(a);
        a=add(a);
        System.out.println(a);
    }
    private static int add(int a){
        a=a+1;
        return a;
    }
}
