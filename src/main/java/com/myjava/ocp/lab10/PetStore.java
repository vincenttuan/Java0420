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
            public void eat() {
                System.out.println("骨頭");
            }
        };
        d.play();
        //((PetStore$1)d).eat(); //目前已不適用
    }
}
