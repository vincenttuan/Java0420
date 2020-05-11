package com.myjava.ocp.lab07;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("柴犬");
        System.out.println(dog.getName());
        dog.shout();
        Cat cat = new Cat("波斯貓");
        System.out.println(cat.getName());
        cat.shout();
        
    }
}
