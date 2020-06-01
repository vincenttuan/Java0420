package com.myjava.ocp.lab12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        
        HashSet<Coin> hs = new HashSet<>();
        hs.add(coin1);hs.add(coin5);hs.add(coin10);
        System.out.println(hs);
        
        // Java 7
        int sum = 0;
        Iterator<Coin> it = hs.iterator();
        while (it.hasNext()) {
            Coin coin = it.next();
            sum += coin.getMoney();
        }
        System.out.printf("sum = %d\n", sum);
        // Java 8
        sum = hs.stream()
                .filter(e -> (e instanceof Coin))
                .mapToInt(e -> e.getMoney())
                .peek(e -> System.out.println(e))
                .sum();
        System.out.printf("sum = %d\n", sum);
    }
}
