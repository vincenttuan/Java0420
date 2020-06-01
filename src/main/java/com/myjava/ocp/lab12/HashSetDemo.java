package com.myjava.ocp.lab12;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Blue");
        Paper paper = new Paper();
        paper.setSize("A5");
        HashSet<Object> hs = new HashSet<>();
        hs.add(pen);
        hs.add(paper);
        System.out.println(hs);
        // 使用 Iterator
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
        it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if(next instanceof Paper) {
                it.remove();
            }
        }
        System.out.println(hs);
        
    }
}
