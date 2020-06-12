package com.myjava.ocp.lab15;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;
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
        // Java 8 toMap()
        // Key 不可重複, 所以我們可以藉由 
        // fruitNameSet [banana, orange, apple, watermelon, coconut] 來分析
        Map<String, Integer> fruitMap = fruitNameSet
                .stream()
                .collect(toMap(String::toString, String::length));
        System.out.println(fruitMap);
    }
}
