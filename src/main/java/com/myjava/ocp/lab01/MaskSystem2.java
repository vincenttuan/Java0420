package com.myjava.ocp.lab01;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class MaskSystem2 {
    public static void main(String[] args) {
        Mask m1 = new Mask("Red", true);
        Mask m2 = new Mask("Red", false);
        Mask m3 = new Mask("Blue", true);
        
        // Java 8 串流(Stream)分析
        Stream.of(m1, m2, m3).forEach(m -> {
            System.out.printf("color: %s price: %d %s\n", m.getColor(), Mask.price, m.isChild()?"兒童":"成人");
        });
        System.out.println("-------------------------------------------");
        Stream.of(m1, m2, m3).filter(m -> m.isChild()).forEach(m -> {
            System.out.printf("color: %s price: %d %s\n", m.getColor(), Mask.price, m.isChild()?"兒童":"成人");
        });
        System.out.println("-------------------------------------------");
        Stream.of(m1, m2, m3).filter(m -> !m.isChild()).forEach(m -> {
            System.out.printf("color: %s price: %d %s\n", m.getColor(), Mask.price, m.isChild()?"兒童":"成人");
        });
        System.out.println("-------------------------------------------");
        int sum = Stream.of(m1, m2, m3).mapToInt(m -> m.getPrice()).sum();
        System.out.println("sum = " + sum);
        System.out.println("-------------------------------------------");
        double avg = Stream.of(m1, m2, m3).mapToInt(m -> m.getPrice()).average().getAsDouble();
        System.out.println("avg = " + avg);
        System.out.println("-------------------------------------------");
        IntSummaryStatistics stat = Stream.of(m1, m2, m3).mapToInt(m -> m.getPrice()).summaryStatistics();
        System.out.println(stat);
    }
}
