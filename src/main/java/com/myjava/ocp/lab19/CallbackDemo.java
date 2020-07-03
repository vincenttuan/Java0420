package com.myjava.ocp.lab19;

import java.util.Random;

interface Box {
    void setValue(int value);
}

class Student implements Runnable {
    Box box;
    public Student(Box box) {
        this.box = box;
    }
    @Override
    public void run() {
        while (true) {            
            int value = new Random().nextInt(101);
            box.setValue(value);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class CallbackDemo {
    public static void main(String[] args) {
        Box box = (value) -> {
            System.out.println("我得到 " + value);
        };
        Student student = new Student(box);
        Thread t = new Thread(student);
        t.start();
    }
}
