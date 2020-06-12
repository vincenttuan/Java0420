package com.myjava.ocp.lab15;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryMain {

    public static void main(String[] args) {
        List<Country> couList = Arrays.asList(
                new Country("Japan", "ASIA"),
                new Country("Italy", "EUROPE"),
                new Country("Germany", "EUROPE"));

        System.out.println(
                couList.stream().collect(Collectors.groupingBy(Country::getRegion, Collectors.toList()))
        );
        
        Map<String, List<String>> regionNames = couList.stream().
                collect(Collectors.groupingBy(Country::getRegion,
                        LinkedHashMap::new ,
                        Collectors.mapping(Country::getName, Collectors.toList())));
        System.out.println(regionNames);

    }
}
