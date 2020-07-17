package com.myjava.ocp.lab23;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String[] rows = {"apple", "banana"};
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\news.txt";
        try(FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw, 16 * 1024)) {
            
            for(String row : rows) {
                bw.write("\n" + row);
            }
            
        } catch (Exception e) {
        }
    }
}
