package com.myjava.ocp.lab20;

public class Put {
    synchronized void put() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 進入到 put()\n", tName);
        while (true);
    }
    synchronized void print() {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 進入到 print()\n", tName);
    }
    
    public static void main(String[] args) {
        Put p = new Put();
        Runnable r = () -> p.put();
        Runnable r2 = () -> p.put();
        Runnable r3 = () -> p.print();
        new Thread(r, "John").start();
        new Thread(r2, "Mary").start();
        new Thread(r3, "Tom").start();
    }
}
