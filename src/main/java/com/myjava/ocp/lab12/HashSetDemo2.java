package com.myjava.ocp.lab12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Red");
        Pen pen2 = new Pen("Blue");
        Paper paper1 = new Paper("A4");
        Paper paper2 = new Paper("A5");
        Coin coin1 = new Coin(1);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        
        HashSet<Object> hs = new HashSet<>();
        hs.add(pen1);hs.add(pen2);hs.add(paper1);hs.add(paper2);
        hs.add(coin1);hs.add(coin5);hs.add(coin10);
        System.out.println(hs);
        
        // Java 7
        int sum = 0;
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if(next instanceof Coin) {
                sum += ((Coin) next).getMoney();
            }
        }
        System.out.printf("sum = %d\n", sum);
        // Java 8
        sum = hs.stream()
                .filter(e -> (e instanceof Coin))
                .map(e -> (Coin)e)
                .mapToInt(e -> e.getMoney())
                .peek(e -> System.out.println(e))
                .sum();
                //.forEach(e -> System.out.println(e));
        System.out.printf("sum = %d\n", sum);
    }
}
