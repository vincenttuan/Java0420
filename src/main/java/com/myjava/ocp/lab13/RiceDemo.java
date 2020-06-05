package com.myjava.ocp.lab13;

import com.google.gson.Gson;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RiceDemo {
    public static void main(String[] args) throws Exception {
        List<Rice> list = new LinkedList<>();
        File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab13\\urls.txt");
        String urls = new Scanner(file).useDelimiter("\\A").next();
        for(String urlstring : urls.split("\n")) {
            addData(urlstring.trim(), list);
        }
        // 3. 分析
        list.stream()
                .filter(rice -> rice.品名.contains("外銷日本的米"))
                .forEach(rice -> System.out.printf("%s %s %s %s %s\n", rice.品名, rice.國際條碼, rice.檢驗結果, rice.Title, rice.不合格原因));
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
