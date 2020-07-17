package com.myjava.ocp.lab23;

import java.io.FileWriter;

public class WriteNews {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try(FileWriter fw = new FileWriter(path, true)) { // true 會保留之前的資料
            String data = "Welcome vs Wellcome";
            fw.write(data);
        } catch (Exception e) {
        }
    }
}
