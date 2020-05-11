package com.myjava.ocp.lab07;

public class Zoo4 {
    public static void main(String[] args) {
        Animal a = new Tiger("老虎");
        ((Cat)a).shout();
        ((Tiger)a).shout();
        ((Dog)a).shout();
    }
}
