package com.myjava.ocp.lab18;

public class RaceDemo {
    public static void main(String[] args) {
        Race race1 = new Race("烏龜");
        Race race2 = new Race("兔子");
        RaceHelper helper = new RaceHelper("陪跑");
        helper.setDaemon(true);
        race1.start();
        race2.start();
        helper.start();
        System.out.println("Active thread count: " + Thread.activeCount());
    }
}
