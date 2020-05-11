package com.myjava.ocp.lab07;

import java.util.stream.IntStream;

public class VarageDemo2 {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
    }
    
    public static int add(int... nums) {
        return IntStream.of(nums).sum();
    }
    
    public static int add(int x, int y) {
        return x * y;
    }
    
}
