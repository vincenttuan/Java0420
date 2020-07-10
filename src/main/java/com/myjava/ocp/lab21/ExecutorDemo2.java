package com.myjava.ocp.lab21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("Runner");
    }
}

public class ExecutorDemo2 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Runner());
        System.out.println(f1.get());
        es.shutdown();
    }
}
