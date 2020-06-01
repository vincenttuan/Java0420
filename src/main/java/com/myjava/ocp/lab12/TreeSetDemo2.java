package com.myjava.ocp.lab12;

import java.util.IntSummaryStatistics;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Exam.sort = 1;
        Exam e1 = new Exam("國文", 80);
        Exam e2 = new Exam("數學", 90);
        Exam e3 = new Exam("英文", 100);
        TreeSet<Exam> scores = new TreeSet<>();
        scores.add(e1);scores.add(e2);scores.add(e3);
        System.out.println(scores);
        // Java 8 總分與平均
        scores.stream()
                .forEach(System.out::println); // e -> System.out.println(e)
        
        scores.stream()
                .mapToInt(e -> e.getScore())
                .forEach(System.out::println);
        
        int sum = scores.stream()
                    .mapToInt(e -> e.getScore())
                    .sum();
        
        double avg = scores.stream()
                    .mapToInt(e -> e.getScore())
                    .average()
                    .getAsDouble();
        
        System.out.printf("sum: %d, avg=%.2f\n", sum, avg);
        
        IntSummaryStatistics stat = scores.stream()
                .mapToInt(e -> e.getScore())
                .summaryStatistics();
        System.out.printf("sum: %d, avg=%.2f\n", stat.getSum(), stat.getAverage());
        System.out.printf("max: %d, min=%d\n", stat.getMax(), stat.getMin());
        
        // 最高分是哪一科?
        String subject = scores.stream().filter(e -> e.getScore() == stat.getMax())
                .findFirst()
                .get()
                .getSubject();
        System.out.println(subject);
        
        
    }
}
