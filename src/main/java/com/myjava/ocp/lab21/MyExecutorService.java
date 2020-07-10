package com.myjava.ocp.lab21;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lotto implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        int n = new Random().nextInt(100);
        System.out.printf("Lotto 數字: %d\n", n);
    }
}
public class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        //ExecutorService es = Executors.newFixedThreadPool(2);
        for(int i=1;i<=50;i++) {
            es.submit(new Lotto());
        }
        System.out.printf("執行緒數量:%d\n", Thread.activeCount());
        es.shutdown();
        
    }
}
