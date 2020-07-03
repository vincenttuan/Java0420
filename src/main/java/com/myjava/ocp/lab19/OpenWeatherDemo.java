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
                                      .get("main")       // 取得 main 這個 json 元素
                                      .getAsJsonObject();// 得到該元素的 json 物件
            System.out.println(jo);
            
        } catch (Exception e) {
        }
    };
    public static void main(String[] args) {
        new Thread(r).start();
    }
}
