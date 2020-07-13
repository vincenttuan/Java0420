package com.myjava.ocp.lab21;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

class Num implements Runnable {
    static ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            String tname = Thread.currentThread().getName();
            for(int i=1;i<=5;i++) {
                Thread.sleep(new Random().nextInt(5000));
                int n = new Random().nextInt(10);
                System.out.printf("%s %d: %d\n", tname, i, n);
            }
        } catch (Exception e) {
        } finally {
            lock.unlock();
        }
    }

}

public class LockDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Num());
        Thread t2 = new Thread(new Num());
        Thread t3 = new Thread(new Num());
        t1.setName("Vincent");
        t2.setName("Anita");
        t3.setName("Mary");
        t1.start();
        t2.start();
        t3.start();
    }
}
