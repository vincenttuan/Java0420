package com.myjava.ocp.lab09;

public class Tank extends Car {
    
    public Tank(String name) {
        super(name);
    }
    
    public void move() {
        System.out.println(getName() + "用輪子走");
    }

}
