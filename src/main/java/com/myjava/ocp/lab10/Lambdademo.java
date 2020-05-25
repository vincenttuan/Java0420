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
                return (n >= 60)?true:false;
            }
        });
        // Java 8
        checkScore(scores, (int n) -> (n >= 60)?true:false);
        checkScore(scores, (n) -> (n >= 80)?true:false);
        checkScore(scores, (n) -> {
                                    return (n >= 80)?true:false;
                                  });
        Calc case1 = (n) -> (n >= 60)?true:false;
        Calc case2 = (n) -> (n >= 80)?true:false;
        checkScore(scores, case1);
    }
    
    public static void checkScore(int[] scores, Calc calc) {
        for(int score : scores) {
            if(calc.check(score)) {
                System.out.println(score);
            }
        }
    }
    
}
