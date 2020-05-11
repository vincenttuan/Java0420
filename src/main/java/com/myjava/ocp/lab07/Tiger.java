package com.myjava.ocp.lab07;

public class Tiger extends Cat {

    public Tiger(String name) {
        super(name);
    }

    public void shout() {
        System.out.println("吼吼~");
    }

    public void hunt() {
        System.out.println("獵殺動物");
    }

}
