package com.myjava.ocp.lab04;

import java.util.Arrays;

public class ForeachDemo {
    public static void main(String[] args) {
        int[][] nums = {{10, 20}, {30, 40}};
        int sum = 0;
        for(int[] num : nums) {
            for(int n : num) {
                if(n > 25) {
                    sum += n;
                }
            }
        }
        System.out.println(sum);
        // flat 扁平, Map 轉換
        int sum2 = Arrays.stream(nums)
                .flatMapToInt(num -> Arrays.stream(num))
                .filter(n -> n >25)
                .sum();
        System.out.println(sum2);
    }
}
