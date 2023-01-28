package com.yunqi;

import java.util.concurrent.CountDownLatch;

public class Demo8 {
    public static void main(String[] args) throws InterruptedException {
        //倒计时器,数字为线程数
        CountDownLatch cl=new CountDownLatch(5);
        //当前的时间ms
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run(){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //倒计时器减一
                        cl.countDown();
                    }
                };
            }.start();
        }
        cl.await();
        System.out.println(cl.getCount());
        System.out.println(String.format("耗时:%sms",System.currentTimeMillis()-start));
    }
}
