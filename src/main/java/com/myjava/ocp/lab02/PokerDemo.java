package com.myjava.ocp.lab02;
// ♠♥♦♣

import java.util.Random;

public class PokerDemo {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    
    public static void main(String[] args) {
        String[] poker = {
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", 
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", 
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
        };
        print(poker);
        shuffle(poker, 10000);
        print(poker);
        
        double sum = getScore(0, poker) + getScore(1, poker) + getScore(2, poker);
        System.out.println(sum);
    }
    
    public static double getScore(int pos, String[] poker) {
        String posValue = poker[pos];
        switch(posValue){
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":    
                return 0.5;
            default: // 2 ~ 10
                return Integer.parseInt(posValue); // 字串轉數字
        }
    }
    public static void shuffle(String[] poker, int count) {
        Random r = new Random();
        for(int i=1;i<=count;i++) {
            int pos1 = r.nextInt(poker.length);
            int pos2 = r.nextInt(poker.length);
            String pos1Value = poker[pos1];
            String pos2Value = poker[pos2];
            poker[pos1] = pos2Value;
            poker[pos2] = pos1Value;
        }
    }
    
    public static void print(String[] poker) {
        for(String p : poker) {
            String color = p.equals("J") || p.equals("Q") || p.equals("K") ? RED : BLACK;
            System.out.print(color + p + " ");
        }
        System.out.println();
    }
}
