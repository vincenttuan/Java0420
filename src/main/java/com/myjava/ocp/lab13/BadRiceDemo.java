package com.myjava.ocp.lab13;

import java.net.URL;
import java.util.Scanner;

public class BadRiceDemo {
    public static void main(String[] args) throws Exception {
        // 1. 抓取資料源
        String urlpath = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        URL url = new URL(urlpath);
        String jsonstring = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A").next();
        System.out.println(jsonstring);
    }
}
