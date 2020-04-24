package com.myjava.ocp.lab02;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] score = {100, 90, 80};
        for(int i=0;i<score.length;i++) {
            System.out.println(score[i]);
        }
        for(int s : score) {
            System.out.println(s);
        }
    }
}
