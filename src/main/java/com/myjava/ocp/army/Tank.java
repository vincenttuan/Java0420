package com.myjava.ocp.army;

public class Tank extends Car implements Weapon {

    public Tank() {
        System.out.println("Tank...");
    }

    public void move() {
        System.out.println("Tank 是用履帶走的...");
    }

    public void shoot() {
        System.out.println("發射 105 榴砲 ...");
    }
}
