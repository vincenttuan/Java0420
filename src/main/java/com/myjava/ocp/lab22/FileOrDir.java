package com.myjava.ocp.lab22;

import java.io.File;

public class FileOrDir {
    public static void main(String[] args) {
        File f = new File("C:\\Program Files\\ojdkbuild\\java-1.8.0-openjdk-1.8.0.242-1");
        File[] files = f.listFiles();
        for(File file : files) {
            System.out.printf("(%s) %s\n", file.isFile()?"檔案":"目錄", file);
        }
    }
}
