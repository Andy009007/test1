package com.yunqi;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Demo9 extends RecursiveTask<Long> {

    private static final long MAX = 1000000000L;
    private static final long THRESHOLD = 1000L;
    private long start;
    private long end;

    public Demo9(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        text();
        System.out.println("-----------------");
        textForkJoin();
    }

    //串行方法
    private static void text() {
        System.out.println("text");
        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0L; i <= MAX; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start + "ms");
    }
    //并行方法
    private static void textForkJoin() {
        System.out.println("textForkJoin");
        long start = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Long sum = forkJoinPool.invoke(new Demo9(1, MAX));
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    @Override
    protected Long compute() {
        long sum = 0;
        if (end - start <= THRESHOLD) {
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            long mid = (start + end) / 2;
            Demo9 task1 = new Demo9(start, mid);
            task1.fork();
            Demo9 task2 = new Demo9(mid + 1, end);
            task2.fork();
            return task1.join() + task2.join();
        }
    }
}
