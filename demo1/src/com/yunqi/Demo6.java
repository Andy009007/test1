package com.yunqi;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Demo6 {
    public static void main(String[] args) {
        //text1();
        //text2();
        /*try {
            text3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        text4();


    }


    //两个线程交换数据案例
    public static void text1() {
        Exchanger exchanger = new Exchanger();
        //创建线程1
        new Thread(() -> {
            try {
                Object data = "我是第一个线程";
                System.out.println(Thread.currentThread().getName() + data);
                //开始交换数据
                data = exchanger.exchange(data);
                System.out.println(Thread.currentThread().getName() + data);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        //创建线程2
        new Thread(() -> {
            try {
                Object data = "我是第二个线程";
                System.out.println(Thread.currentThread().getName() + data);
                data = exchanger.exchange(data);
                System.out.println(Thread.currentThread().getName() + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


    //线程超时数据交换案例
    private static void text2() {
        Exchanger exchanger = new Exchanger();
        new Thread(() -> {
            try {
                Object data = "超时了吗";
                System.out.println(Thread.currentThread().getName() + data);
                data = exchanger.exchange(data, 3000L, TimeUnit.MILLISECONDS);
                System.out.println(Thread.currentThread().getName() + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }).start();
    }

    //线程中断数据交换
    private static void text3() throws InterruptedException {
        Exchanger exchanger = new Exchanger();
        Thread thread = new Thread(() -> {
            try {
                Object data = "中断了吗";
                System.out.println(Thread.currentThread().getName() + data);
                data = exchanger.exchange(data);
                System.out.println(Thread.currentThread().getName() + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        //线程中断
        Thread.sleep(3000L);
        thread.interrupt();
    }

    //两两交换线程数据
    private static void text4() {

        Exchanger exchanger = new Exchanger();
        for (int i = 0; i < 10; i++) {
            Integer data = i;
            new Thread(()->{
                try {
                    Object e=exchanger.exchange(data);
                    System.out.println(Thread.currentThread().getName()+"--"+e);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            },"java技术栈"+i).start();

        }
    }


}
