package com.myjava.ocp.lab09;

public class Truck extends Car {

    public Truck(String name) {
        super(name);
    }

    public void move() {
        System.out.println(getName() + "用履帶走");
    }

}
