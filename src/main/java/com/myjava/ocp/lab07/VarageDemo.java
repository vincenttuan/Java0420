package com.myjava.ocp.lab07;

import java.util.stream.IntStream;

public class VarageDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(add(nums));
        System.out.println(add(10, 20, 30, 40, 50, 60));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10, 20));
        System.out.println(add(10));
        System.out.println(add());
    }
    
    public static int add(int... nums) {
        return IntStream.of(nums).sum();
    }
    
    
}
