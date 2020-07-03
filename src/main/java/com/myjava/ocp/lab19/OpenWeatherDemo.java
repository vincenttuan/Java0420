package com.myjava.ocp.lab19;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;

public class OpenWeatherDemo {
    static Runnable r = () -> {
        try {
            String path = "https://api.openweathermap.org/data/2.5/weather?q=Taipei&appid=794612d0a2869ed6b7c78d427133a5fc";
            String json = new Scanner(new URL(path).openStream()).useDelimiter("\\A").next();
            JsonObject jo = JsonParser.parseString(json) // 剖析 json 字串
                                      .getAsJsonObject() // 取得 json 根物件
                                      .getAsJsonObject("main");// 取得名稱為 main 的 json 物件
            System.out.println(jo.get("temp").getAsDouble() - 273.15);
            System.out.println(jo.get("feels_like").getAsDouble() - 273.15);
            
            JsonObject jo2 = JsonParser.parseString(json)
                                       .getAsJsonObject()
                                       .getAsJsonArray("weather")
                                       .get(0)
                                       .getAsJsonObject();
            System.out.println(jo2.get("description").getAsString());
            String icon_url = "http://openweathermap.org/img/wn/%s.png";
            System.out.println(String.format(icon_url, jo2.get("icon").getAsString()));
        } catch (Exception e) {
        }
    };
    public static void main(String[] args) {
        new Thread(r).start();
    }
}
