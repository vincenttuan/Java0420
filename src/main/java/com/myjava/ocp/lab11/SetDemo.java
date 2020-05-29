package com.myjava.ocp.lab11;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("國文");
        hs.add("數學");
        hs.add("英文");
        System.out.println(hs);
        
        HashSet<Pen> hs2 = new HashSet<>();
        hs2.add(new Pen("Red", 10));
        hs2.add(new Pen("Blue", 10));
        hs2.add(new Pen("Red", 10));
        System.out.println(hs2);
        // Java 7
        for(Pen pen : hs2) {
            System.out.println(pen.getColor());
        }
        // Java 8 foreach
        hs2.forEach(pen -> System.out.println(pen.getColor()));
        
    }
}
