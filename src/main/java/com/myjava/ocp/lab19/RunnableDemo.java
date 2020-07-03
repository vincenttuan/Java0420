package com.myjava.ocp.lab19;

import java.util.Date;
import java.util.Random;

public class RunnableDemo {
    public static void main(String[] args) {
         Runnable r1 = () -> {System.out.println(new Date());};
         Runnable r2 = () -> {System.out.println(new Random().nextInt(100));};
         
         Thread t = new Thread(r2);
         t.start();
         
    }
}
