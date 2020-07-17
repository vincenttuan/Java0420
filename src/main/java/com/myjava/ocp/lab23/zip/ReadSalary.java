package com.myjava.ocp.lab23.zip;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.ZipInputStream;

public class ReadSalary {

    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab23\\zip\\salary.zip";
        try (FileInputStream fr = new FileInputStream(path);
             ZipInputStream zip = new ZipInputStream(fr);
             Reader r = new InputStreamReader(zip, "UTF-8");) {

            // 取得被壓縮檔名 
            System.out.println(zip.getNextEntry().getName());
            char[] buffer = new char[1];
            // 讀取檔案內容
            while (r.read(buffer) != -1) {
                System.out.print(buffer);
            }
            System.out.println();
        } catch (Exception e) {

        }

    }
}
