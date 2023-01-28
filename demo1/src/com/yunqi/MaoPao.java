package com.yunqi;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr=new int[]{1,8,9,7,4,5,6,5,1,5,2};

        int temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
