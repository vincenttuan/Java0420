package com.myjava.ocp.lab22;

import java.io.File;

// 建立 fruit/apple.txt
public class CreateNewFile2 {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files\\fruit");
        System.out.printf("路徑是否存在: %b\n", path.exists());
        if(!path.exists()) {
            System.out.printf("建立路徑: %b\n", path.mkdir());
        }
        
    }
}
