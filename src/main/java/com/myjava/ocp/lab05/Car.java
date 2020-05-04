package com.myjava.ocp.lab05;

public class Car {
    Wheel wheel;
    Tire[] tires;
    Engine engine;

    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", tires=" + tires + ", engine=" + engine + '}';
    }
    
}
