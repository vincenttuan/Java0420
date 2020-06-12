package com.myjava.ocp.lab15;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;
import java.util.stream.Stream;

public class Grouping4 {

    public static void main(String[] args) {
        String[] names = {"Tom", "John", "Helen", "Jane", "Mary"};

        // map1: {Tom=3, John=4, Helen=5, Jane=4, Mary=4}
        // map2: {3=[Tom], 4=[John, Jane, Mary], 5=[Helen]}
        
        System.out.println("map1: " +
                Stream.of(names)
                        .collect(toMap(String::toString, String::length))
                        .entrySet()
        );
        System.out.println("map2: " +
                Stream.of(names)
                        .collect(toMap(String::toString, String::length))
                        .entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toSet())))
        );

    }
}
