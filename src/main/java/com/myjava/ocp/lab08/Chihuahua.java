package com.myjava.ocp.lab08;

public class Chihuahua implements Dog {

    @Override
    public void eat() {
        System.out.println("骨頭");
    }

    @Override
    public void skill() {
        System.out.println("玩球");
    }
    
}
