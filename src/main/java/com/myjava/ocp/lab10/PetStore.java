package com.myjava.ocp.lab10;

interface Dog {
    void play();
}

public class PetStore {
    public static void main(String[] args) {
        Dog d = new Dog(){
            public void play() {
                System.out.println("握手");
            }
        };
        d.play();
    }
}
