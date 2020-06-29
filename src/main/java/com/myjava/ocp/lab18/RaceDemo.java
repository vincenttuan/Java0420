package com.myjava.ocp.lab18;

public class RaceDemo {
    public static void main(String[] args) {
        Race race1 = new Race("烏龜");
        Race race2 = new Race("兔子");
        race1.start();
        race2.start();
        System.out.println("Active thread count: " + Thread.activeCount());
    }
}
