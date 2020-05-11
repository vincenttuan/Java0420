package com.myjava.ocp.lab07;

public class Animal {

    private String name;

    public Animal() {
        name = "動物";
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout() {
        System.out.println("叫聲~");
    }

}
