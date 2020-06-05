package com.myjava.ocp.lab13;

import com.google.gson.Gson;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RiceDemo {
    public static void main(String[] args) throws Exception {
        // 1. 抓取資料源
        //String urlpath = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        String urlpath = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceQualified.aspx";
        URL url = new URL(urlpath);
        String jsonstring = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        //System.out.println(jsonstring);
        // 2. 將 json 透過 Gson 轉成 BadRice[]
        Rice[] rices = new Gson().fromJson(jsonstring, Rice[].class);
        // 建立 list 容器, 並將 badRices 注入
        List<Rice> list = new LinkedList<>();
        for(Rice rice : rices) {
            list.add(rice);
        }
        //System.out.println(list);
        // 3. 分析
        list.stream()
                .filter(rice -> rice.品名.contains("日本"))
                .forEach(rice -> System.out.printf("%s %s\n", rice.品名, rice.不合格原因));
    }
}
