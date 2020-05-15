package com.myjava.ocp.lab08;

public class DogMain {
    public static void main(String[] args) {
        Chihuahua chihuahua = new Chihuahua();
        Shiba shiba = new Shiba();
        chihuahua.eat();
        chihuahua.skill();
        shiba.eat();
        shiba.skill();
        print(chihuahua);
        print(shiba);
    }
    public static void print(Dog dog) {
        dog.eat();
        dog.skill();
    }
}
