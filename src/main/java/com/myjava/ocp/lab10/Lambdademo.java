package com.myjava.ocp.lab10;

interface Calc {
    boolean check(int n);
}

public class Lambdademo {
    public static void main(String[] args) {
        int[] scores = {100, 50, 70, 40};
        // Java 7
        checkScore(scores, new Calc() {
            public boolean check(int n) {
                if (n >= 60) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        
    }
    
    public static void checkScore(int[] scores, Calc calc) {
        for(int score : scores) {
            if(calc.check(score)) {
                System.out.println(score);
            }
        }
    }
    
}
