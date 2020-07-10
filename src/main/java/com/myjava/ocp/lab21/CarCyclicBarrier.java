package com.myjava.ocp.lab21;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

class Car extends Thread {
    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }
    
    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        System.out.printf("%s 從台北出發\n", tname);
        try {
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了\n", tname);
            cb.await(); // 等待其他人
        } catch (Exception e) {
        }
        System.out.printf("%s 繼續往高雄前進\n", tname);
    }
    
}

public class CarCyclicBarrier {
    public static void main(String[] args) {
        //CyclicBarrier cb = new CyclicBarrier(3);
        CyclicBarrier cb = new CyclicBarrier(4, ()->{
            String tname = Thread.currentThread().getName();
            System.out.printf("%s 執行 -> 完成了\n", tname);
        });
        for(int i=1;i<=4;i++) {
            new Car(cb).start();
        }
    }
}
