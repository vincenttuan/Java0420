package com.myjava.ocp.lab18;

public class RaceDemo {
    public static void main(String[] args) {
        Race race1 = new Race();
        Race race2 = new Race();
        race1.setName("烏龜");
        race2.setName("兔子");
        race1.start();
        race2.start();
    }
}
