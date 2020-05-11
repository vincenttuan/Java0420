package com.myjava.ocp.lab07;

public class GameDemo {
    public static void main(String[] args) {
        Game g1 = Game.getInstance();
        Game g2 = Game.getInstance();
        g1.start();
        g2.start();
    }
}
