package com.myjava.ocp.lab21;

class ShortTask implements Runnable {
    @Override
    public void run() {
        System.out.println("短任務完成");
    }
}

class LongTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("長任務開始");
            Thread.sleep(2000);
            System.out.println("長任務進行中");
            Thread.sleep(2000);
            System.out.println("長任務結束");
        } catch (Exception e) {
        }
    }
}


public class ExecutorDemo3 {
    
}
