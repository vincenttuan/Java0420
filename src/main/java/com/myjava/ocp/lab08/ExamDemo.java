package com.myjava.ocp.lab08;

import java.util.Arrays;

public class ExamDemo {
    public static void main(String[] args) {
        int[][] exams = {{100, 90}, {50, 80}, {70, 100}};
        
        double chineseAvg = Arrays.stream(exams)
                            .mapToInt(e -> e[0])
                            .average()
                            .getAsDouble();
        System.out.println(chineseAvg);
        
        int[] exam = {100, 90};
        System.out.println(Arrays.stream(exam).average().getAsDouble());
        
        double classAvg = Arrays.stream(exams)
               .mapToDouble(e -> Arrays.stream(e).average().getAsDouble())
               .average()
               .getAsDouble();
        System.out.println(classAvg);
        
    }
}
