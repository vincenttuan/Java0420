package com.myjava.ocp.lab13;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(0, 80);
        list.add(90);
        System.out.println(list);
        System.out.println(list.size());
        // 輪詢顯示集合內容
        for(Integer i : list) {
            System.out.println(i);
        }
        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            int index = iter.nextIndex();
            Integer value = iter.next();
            System.out.printf("%d : %d\n", index, value);
        }
        while (iter.hasPrevious()) {
            int index = iter.previousIndex();
            Integer value = iter.previous();
            System.out.printf("%d : %d\n", index, value);
        }
        
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        
        // Java 8 輪詢顯示集合內容
        list.forEach(System.out::println);
        list.forEach(e -> System.out.println(e));
    }
}
