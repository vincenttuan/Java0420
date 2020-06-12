package com.myjava.ocp.lab15;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

public class Grouping {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "banana", "watermelon", "apple", 
                           "orange", "watermelon", "banana", "coconut"};
        // Java 7
        Set<String> fruitNames = new HashSet<>();
        for(String name : fruits) {
            fruitNames.add(name);
        }
        System.out.println(fruitNames);
        // Java 8 toSet()
        Set<String> fruitNameSet = Stream.of(fruits).collect(toSet());
        System.out.println(fruitNameSet);
        // Java 8 toList()
        List<String> fruitNameList = Stream.of(fruits).collect(toList());
        System.out.println(fruitNameList);
    }
}
