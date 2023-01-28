package com.yunqi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread t1=new Thread1();
        Thread t2=new Thread(new Thread2());
        FutureTask<User> ft=new FutureTask<>(new Thread3<>());
        Thread t3=new Thread(ft);

        t1.start();
        t2.start();
        t3.start();
        System.out.println(ft.get());

    }


    //继承Thread类
    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("第一种方法运行了");
        }
    }

    //实现Runnable
    static class Thread2 implements Runnable{
        @Override
        public void run() {
            System.out.println("第二种方法运行了");
        }
    }

    //实现Callable
    static class Thread3<T> implements Callable<T>{
        @SuppressWarnings("unchecked")
        @Override
        public T call() throws Exception {
            System.out.println("第三种方法运行了");
            return (T) new User();
        }
    }

    public static class User{
        Integer age;

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    '}';
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

}


