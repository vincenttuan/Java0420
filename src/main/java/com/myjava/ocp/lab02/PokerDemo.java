package com.myjava.ocp.lab02;
// ♠♥♦♣

import java.util.Random;

public class PokerDemo {
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
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
