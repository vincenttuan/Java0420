package com.myjava.ocp.army;

public class ArmyMain {

    public ArmyMain() {
    }

    public static void main(String[] args) {
        Airplane airplane = new Fighter();
        airplane.move();
        Car car1 = new Tank();
        Car car2 = new Truck();
        car1.move();
        car2.move();
        if (car1 instanceof Weapon) {
            Weapon w = (Weapon) car1;
            w.copyright();
            w.shoot();
        }
        if (car2 instanceof Weapon) {
            Weapon w = (Weapon) car2;
            w.copyright();
            w.shoot();
        }
        if (airplane instanceof Weapon) {
            Weapon w = (Weapon) airplane;
            w.copyright();
            w.shoot();
        }
        

    }
}
