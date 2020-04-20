package com.myjava.ocp.lab01;

public class MaskSystem {
    public static void main(String[] args) {
        Mask m1 = new Mask();
        m1.setColor("Blue");
        m1.setPrice(5);
        Mask m2 = new Mask();
        m2.setColor("Red");
        m2.setPrice(5);
        System.out.printf("color: %s price: %d\n", m1.getColor(), m1.getPrice());
        System.out.printf("color: %s price: %d\n", m2.getColor(), m2.getPrice());
    }
}
