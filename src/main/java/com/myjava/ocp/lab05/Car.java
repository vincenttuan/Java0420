package com.myjava.ocp.lab05;

public class Car {
    Wheel wheel;
    Tire[] tires;
    Engine engine;
    
    public void print() {
        System.out.println("方向盤:" + wheel);
        for(Tire tire : tires) {
            System.out.println("輪胎:" + tire);
        }
        System.out.println("引擎:" + engine);
    }
    
    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", tires=" + tires + ", engine=" + engine + '}';
    }
    
}
