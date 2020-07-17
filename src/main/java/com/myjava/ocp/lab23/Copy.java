package com.myjava.ocp.lab23;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy {
    public static void main(String[] args) {
        String from = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        String to = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news_backup.txt";
        try(FileReader fr = new FileReader(from);
            FileWriter fw = new FileWriter(to)) {
            
            int x;
            while ((x = fr.read()) != -1) {                
                fw.write((char)x);
            }
            
        } catch (Exception e) {
        }
    }
}
