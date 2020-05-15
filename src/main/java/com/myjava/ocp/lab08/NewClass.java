package com.myjava.ocp.lab08;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
        // flat
        int[] exams = {100, 90, 50, 80, 70, 100};
        
        long count = Arrays.stream(exams).filter(score -> score == 30).count();
        System.out.println(count);
    }
}
