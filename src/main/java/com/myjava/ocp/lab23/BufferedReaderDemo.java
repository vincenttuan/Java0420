package com.myjava.ocp.lab23;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);) {
            
            String data;
            while ((data = br.readLine()) != null) {                
                System.out.println(data);
            }
            
        } catch (Exception e) {
        }
    }
}
