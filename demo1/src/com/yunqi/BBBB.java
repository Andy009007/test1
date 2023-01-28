package com.yunqi;

import java.util.Random;

public class BBBB {
    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 45; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        String token = sb.toString();
        System.out.println(token);

    }
}
