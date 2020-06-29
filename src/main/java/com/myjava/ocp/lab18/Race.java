package com.myjava.ocp.lab18;

public class Race extends Thread {

    public Race(String string) {
        super(string);
    }
    
    @Override
    public void run() {
        job();
        
    }
    
    public void job() {
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000;i++) {
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
        System.out.printf("%s 跑到終點了\n", tName);
    }
}
