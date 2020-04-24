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
        // 洗牌
        int pos1 = 0; // 指定維度
        int pos2 = 1; // 指定維度
        int pos1Value = score[pos1]; // 指定維度內容(值) 
        int pos2Value = score[pos2]; // 指定維度內容(值) 
        // 資料互換
        score[pos1] = pos2Value;
        score[pos2] = pos1Value;
        for(int i=0;i<score.length;i++) {
            System.out.print(i + ":" + score[i] + "\t");
        }
        System.out.println();
        
    }
}
