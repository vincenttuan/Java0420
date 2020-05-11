package com.myjava.ocp.lab07;

import java.util.Random;

public class Zoo2 {
    public static void main(String[] args) {
        Dog dog = new Dog("柴犬");
        Cat cat = new Cat("波斯貓");
        Tiger tiger = new Tiger("老虎");
        print(cat);
        Animal animal = getAnimal();
        print(animal);
    }
    
    public static void print(Animal animal) {
        System.out.println(animal.getName());
        animal.shout();
        if(animal instanceof Tiger) {
            ((Tiger)animal).hunt();
        }
    }
    
    public static Animal getAnimal() {
        int n = new Random().nextInt(4); // 0~3
        switch(n) {
            case 0:
                return new Dog("狼犬");
            case 1:
                return new Cat("花貓");
            case 2:
                return new Tiger("小虎");
        }
        return new Animal();
    }
    
}
