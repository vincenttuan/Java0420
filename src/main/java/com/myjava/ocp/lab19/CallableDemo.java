package com.myjava.ocp.lab19;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class Lotto implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        int n = new Random().nextInt(100);
        return n;
    }
}

public class CallableDemo {
    public static void main(String[] args) throws Exception{
        Lotto lotto = new Lotto();
        FutureTask<Integer> task = new FutureTask<>(lotto);
        new Thread(task).start();
        System.out.println(task.get());
        System.out.println("其他工作...");
    }
}
