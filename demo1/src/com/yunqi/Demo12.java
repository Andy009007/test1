package com.yunqi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo12 {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
    }
}
