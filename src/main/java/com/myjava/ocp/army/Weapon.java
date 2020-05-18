package com.myjava.ocp.army;

public interface Weapon {
    public void shoot();
    public default void copyright() {
        System.out.println("Vincent 製作...");
    }
}
