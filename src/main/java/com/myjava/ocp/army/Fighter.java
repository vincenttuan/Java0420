package com.myjava.ocp.army;

public class Fighter extends Airplane implements Weapon {

    public Fighter() {
        System.out.println("Fighter...");
    }

    public void move() {
        System.out.println("Fighter 是用飛的...");
    }

    public void shoot() {
        System.out.println("發射火狐狸 ...");
    }
}
