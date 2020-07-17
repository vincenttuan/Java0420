package com.myjava.ocp.lab23;

import java.io.FileReader;

public class ReadNews {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try(FileReader fr = new FileReader(path)) {
            int x;
            while ((x = fr.read()) != -1) {                
                System.out.print((char)x);
            }
            System.out.println();
        } catch (Exception e) {
        }
    }
}
