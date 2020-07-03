package com.myjava.ocp.lab19;

import java.net.URL;
import java.util.Scanner;

public class OpenWeatherDemo {
    static Runnable r = () -> {
        try {
            String path = "https://api.openweathermap.org/data/2.5/weather?q=Taipei&appid=794612d0a2869ed6b7c78d427133a5fc";
            String json = new Scanner(new URL(path).openStream()).useDelimiter("\\A").next();
            System.out.println(json);
        } catch (Exception e) {
        }
    };
    public static void main(String[] args) {
        new Thread(r).start();
    }
}
