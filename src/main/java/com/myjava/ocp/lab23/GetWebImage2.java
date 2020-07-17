package com.myjava.ocp.lab23;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class GetWebImage2 {
    public static void main(String[] args) throws Exception {
        String from = "https://www.google.com/search?q=baby&tbm=isch";
        Document doc = Jsoup.connect(from).get();
        System.out.println(doc);
    }
}
