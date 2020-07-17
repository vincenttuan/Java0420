package com.myjava.ocp.lab23;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetWebImage {
    public static void main(String[] args) throws Exception {
        String from = "https://www.carpost.tw/img/carpost.jpg";
        String to = "src/main/java/com/myjava/ocp/lab23/car.jpg";
        URL url = new URL(from);
        URLConnection hc = url.openConnection();
        hc.setRequestProperty("User-Agent", "我不是機器人");
        try(InputStream is = hc.getInputStream();
            FileOutputStream fos = new FileOutputStream(to)) {
            int x;
            while ((x = is.read()) != -1) {                
                //System.out.println(x);
                fos.write(x);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
