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
    
}
