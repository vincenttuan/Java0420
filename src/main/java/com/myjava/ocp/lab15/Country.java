package com.myjava.ocp.lab15;

public class Country {
 
    String name;
    String region;
 
    public Country(String na, String reg) {
        name = na;
        region = reg;
    }
 
    public String getName() {
        return name;
    }
 
    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", region=" + region + '}';
    }
    
    
}
