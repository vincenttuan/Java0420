package com.myjava.ocp.lab07;

public class Zoo3 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("老虎");
        tiger.shout();
        ((Cat)tiger).shout();
        
    }
}
