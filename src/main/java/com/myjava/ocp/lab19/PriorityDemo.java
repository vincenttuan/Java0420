package com.myjava.ocp.lab19;

import java.util.stream.IntStream;

public class PriorityDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            IntStream.rangeClosed(1, 100).forEach(i -> {System.out.printf("小明 %d\n", i);});
        };
        Runnable r2 = () -> {
            IntStream.rangeClosed(1, 100).forEach(i -> {System.out.printf("小英 %d\n", i);});
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
