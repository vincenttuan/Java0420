package com.myjava.ocp.lab18.lucky;

import java.util.Random;

public class Num extends Thread {

    public Num(String string) {
        super(string);
    }

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        int count = 0;
        while (true) {            
            count++;
            int n = new Random().nextInt(1000);
            if(n == 777) {
                System.out.printf("%s 總共取了 %d 次得到 777\n", tName, count);
                break;
            }
        }
    }
    
}
