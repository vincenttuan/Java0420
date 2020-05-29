package com.myjava.ocp.lab11;

public class EqualsDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen("Red", 10);
        Pen p2 = new Pen("Blue", 10);
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
