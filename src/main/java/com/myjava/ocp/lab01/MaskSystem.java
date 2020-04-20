package com.myjava.ocp.lab01;

public class MaskSystem {
    public static void main(String[] args) {
        Mask m1 = new Mask();
        m1.setColor("Blue");
        m1.setChild(true);
        
        Mask m2 = new Mask();
        m2.setColor("Red");
        m2.setChild(false);
        
        Mask m3 = new Mask("Yellow", true);
        
        System.out.printf("color: %s price: %d %s\n", m1.getColor(), Mask.price, m1.isChild()?"兒童":"成人");
        System.out.printf("color: %s price: %d %s\n", m2.getColor(), Mask.price, m2.isChild()?"兒童":"成人");
        System.out.printf("color: %s price: %d %s\n", m3.getColor(), Mask.price, m3.isChild()?"兒童":"成人");
    }
}
