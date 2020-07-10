package com.myjava.ocp.lab21;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lotto implements Runnable {
    @Override
    public void run() {
        int n = new Random().nextInt(100);
        System.out.printf("Lotto 數字: %d\n", n);
    }
}
public class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=1;i<=10;i++) {
            es.submit(new Lotto());
        }
        System.out.printf("執行緒數量:%d\n", Thread.activeCount());
        es.shutdown();
    }
}
