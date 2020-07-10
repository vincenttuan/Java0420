package com.myjava.ocp.lab21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("Runner");
    }
}

class Caller implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Caller";
    }
}
public class ExecutorDemo2 {
    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new Runner());
        Future f2 = es.submit(new Caller());
        System.out.println(f1.get());
        System.out.println(f2.get());
        es.shutdown();
    }
}
