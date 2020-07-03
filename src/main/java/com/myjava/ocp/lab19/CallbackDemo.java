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
            System.out.println("小明得到 " + value);
        };
        Box box2 = (value) -> {
            System.out.println("小英得到 " + value);
        };
        Student student = new Student(box);
        Thread t = new Thread(student);
        t.start();
        Student student2 = new Student(box2);
        Thread t2 = new Thread(student2);
        t2.start();
    }
}
