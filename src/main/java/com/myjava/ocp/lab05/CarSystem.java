package com.myjava.ocp.lab05;

public class CarSystem {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.name = "F1方向盤";wheel.price=100000;
        //System.out.println(wheel);
        
        Tire t1 = new Tire();
        t1.name = "米其林";t1.price=5000;
        Tire t2 = new Tire();
        t2.name = "米其林";t2.price=5000;
        Tire t3 = new Tire();
        t3.name = "米其林";t3.price=5000;
        Tire t4 = new Tire();
        t4.name = "米其林";t4.price=5000;
        
        Engine engine = new Engine();
        engine.power=6000;engine.price=500000;
        
        Car car = new Car();
        car.wheel = wheel;
        car.tires = new Tire[]{t1, t2, t3, t4};
        car.engine = engine;
        //System.out.println(car);
        car.setPrice();
        car.print();
    }
}
