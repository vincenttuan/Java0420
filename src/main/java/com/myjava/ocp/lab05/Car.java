package com.myjava.ocp.lab05;

import java.util.Arrays;

public class Car {
    Wheel wheel;
    Tire[] tires;
    Engine engine;
    int price;
    
    public void setPrice() {
        int tires_price = Arrays.stream(tires).mapToInt(t -> t.price).sum();
        price = wheel.price + engine.price + tires_price;
        
    }
    
    public void print() {
        System.out.println("方向盤:" + wheel);
        for(Tire tire : tires) {
            System.out.println("輪胎:" + tire);
        }
        System.out.println("引擎:" + engine);
        System.out.println("價格:" + price);
    }
    
    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", tires=" + tires + ", engine=" + engine + '}';
    }
    
}
