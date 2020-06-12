package com.myjava.ocp.lab15;

import java.util.Arrays;
import java.util.List;

public class CountryMain {
    public static void main(String[] args) {
        List<Country> couList = Arrays.asList(
                new Country("Japan", "ASIA"),
                new Country("Italy", "EUROPE"),
                new Country("Germany", "EUROPE"));
    }
}
