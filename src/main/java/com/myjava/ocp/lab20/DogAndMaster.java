package com.myjava.ocp.lab20;

import java.util.logging.Level;
import java.util.logging.Logger;

class Cookies {
    private boolean isEmpty = true;
    public synchronized void put(int n) {
        if(!isEmpty) {
            try {
                wait(); // 進入等待
            } catch (InterruptedException ex) {
            }
        }
        System.out.printf("主人放第 %d 塊餅乾\n", n);
        isEmpty = false;
        notify(); // 呼叫小狗
    }
    public synchronized void eat(int n) {
        if(isEmpty) {
            try {
                wait(); // 進入等待
            } catch (InterruptedException ex) {
            }
        }
        System.out.printf("小狗吃第 %d 塊餅乾\n", n);
        isEmpty = true;
        notify(); // 呼叫主人
    }
}

public class DogAndMaster {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Runnable r1 = () -> {
            for(int i=1;i<=10;i++) {
                cookies.put(i); // 放餅乾的工作
            }
        };
        Runnable r2 = () -> {
            for(int i=1;i<=10;i++) {
                cookies.eat(i); // 吃餅乾的工作
            }
        };
        new Thread(r2, "小狗").start();
        new Thread(r1, "主人").start();
        
    }
}
