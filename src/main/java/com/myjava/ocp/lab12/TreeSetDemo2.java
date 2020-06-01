package com.myjava.ocp.lab12;

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
    }
}
