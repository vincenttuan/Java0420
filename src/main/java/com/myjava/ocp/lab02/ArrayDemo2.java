package com.myjava.ocp.lab02;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] score = {100, 90, 80};
        for(int i=0;i<score.length;i++) {
            System.out.print(i + ":" + score[i] + "\t");
        }
        System.out.println();
        for(int i=score.length-1;i >= 0;i--) {
            System.out.print(i + ":" + score[i] + "\t");
        }
        System.out.println();
    }
}
