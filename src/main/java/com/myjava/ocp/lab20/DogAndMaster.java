package com.myjava.ocp.lab20;

class Cookies {
    public synchronized void put(int n) {
        System.out.printf("主人放第 %d 塊餅乾\n", n);
    }
    public synchronized void eat(int n) {
        System.out.printf("小狗吃第 %d 塊餅乾\n", n);
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
        new Thread(r1, "主人").start();
        new Thread(r2, "小狗").start();
    }
}
