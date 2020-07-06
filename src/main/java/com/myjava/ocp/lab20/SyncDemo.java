package com.myjava.ocp.lab20;

class Ball implements Runnable {
    private int amount = 10;
    private void getAndPrint() {
        String tName = Thread.currentThread().getName();
        int num = amount;
        System.out.printf("%s 取到第 %d 顆球\n", tName, num);
        amount--;
    }
    @Override
    public void run() {
        while (amount > 0) {            
            getAndPrint();
        }
    }
    
}

// 同步執行緒測試
public class SyncDemo {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Thread t1 = new Thread(ball, "甲");
        t1.start();
        //Thread t2 = new Thread(ball, "乙");
    }
}
