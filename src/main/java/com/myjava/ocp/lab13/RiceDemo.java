package com.myjava.ocp.lab13;

import com.google.gson.Gson;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RiceDemo {
    public static void main(String[] args) throws Exception {
        String urlpath1 = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        String urlpath2 = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceQualified.aspx";
        List<Rice> list = new LinkedList<>();
        addData(urlpath1, list);
        addData(urlpath2, list);
        // 3. 分析
        list.stream()
                .filter(rice -> rice.品名.contains("日本"))
                .forEach(rice -> System.out.printf("%s %s %s\n", rice.品名, rice.檢驗結果, rice.不合格原因));
    }
    
    private static void addData(String urlpath, List list) throws Exception {
        // 1. 抓取資料源
        URL url = new URL(urlpath);
        String jsonstring = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        // 2. 將 json 透過 Gson 轉成 BadRice[]
        Rice[] rices = new Gson().fromJson(jsonstring, Rice[].class);
        // 將 rices 加入到 list 容器
        Collections.addAll(list, rices);
    }
}
