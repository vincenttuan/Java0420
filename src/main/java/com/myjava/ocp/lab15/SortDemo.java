package com.myjava.ocp.lab15;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortDemo {
    public static void main(String[] args) {
        Integer[] nums = new Integer[10];
        IntStream.range(0, 10).forEach(i -> nums[i] = new Random().nextInt(100));
        Stream.of(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        
    }
}
