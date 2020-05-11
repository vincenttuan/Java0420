package com.myjava.ocp.lab07;

public class Zoo2 {
    public static void main(String[] args) {
        Dog dog = new Dog("柴犬");
        Cat cat = new Cat("波斯貓");
        Tiger tiger = new Tiger("老虎");
        print(tiger);
        
    }
    
    public static void print(Animal animal) {
        System.out.println(animal.getName());
        animal.shout();
    }
    
}
