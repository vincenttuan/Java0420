package com.myjava.ocp.lab23;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetWebImage2 {
    public static void main(String[] args) throws Exception {
        String from = "https://www.google.com/search?q=baby&tbm=isch";
        URL url = new URL(from);
        URLConnection hc = url.openConnection();
        hc.setRequestProperty("User-Agent", "我不是機器人");
        try(InputStream is = hc.getInputStream()) {
            int x;
            while ((x = is.read()) != -1) {                
                System.out.print((char)x);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}