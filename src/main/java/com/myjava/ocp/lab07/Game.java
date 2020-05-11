package com.myjava.ocp.lab07;

import java.util.Random;

public class Game {
    int serialNo = new Random().nextInt();
    private static Game _instance = new Game();
    private Game() {
    }
    public static Game getInstance() {
        return _instance;
    }
    public void start() {
        System.out.println("LoL:" + serialNo);
    }
}
