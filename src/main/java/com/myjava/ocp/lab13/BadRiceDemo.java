package com.myjava.ocp.lab13;

import com.google.gson.Gson;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BadRiceDemo {
    public static void main(String[] args) throws Exception {
        // 1. 抓取資料源
        String urlpath = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        URL url = new URL(urlpath);
        String jsonstring = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        System.out.println(jsonstring);
        // 2. 將 json 透過 Gson 轉成 BadRice[]
        BadRice[] badRices = new Gson().fromJson(jsonstring, BadRice[].class);
        // 建立 list 容器, 並將 badRices 注入
        List<BadRice> list = new LinkedList<>();
        for(BadRice badRice : badRices) {
            list.add(badRice);
        }
        System.out.println(list);
        // 3. 分析
    }
}
