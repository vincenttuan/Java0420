package com.myjava.ocp.lab03;

public class MultiArrayDemo {
    public static void main(String[] args) {
        int[][] scores = {{100, 90, 80}, {90, 80, 70}};
        System.out.println(scores);
        // for-loop
        for(int i=0;i<scores.length;i++) {
            int[] x = scores[i];
            System.out.println(x);
            for(int k=0;k<x.length;k++) {
                System.out.println(scores[i][k]);
            }
        }
        // for/in(each)
        for(int[] x : scores) {
            System.out.println(x);
            for(int i : x) {
                System.out.println(i);
            }
        }
    }
}
