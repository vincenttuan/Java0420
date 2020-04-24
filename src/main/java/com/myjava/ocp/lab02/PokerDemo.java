package com.myjava.ocp.lab02;
// ♠♥♦♣
public class PokerDemo {
    public static void main(String[] args) {
        String[] poker = {
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", 
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", 
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
        };
        print(poker);
    }
    public static void print(String[] poker) {
        for(String p : poker) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
