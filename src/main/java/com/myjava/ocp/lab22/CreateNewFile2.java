package com.myjava.ocp.lab22;

import java.io.File;

// 建立 fruit/apple.txt
public class CreateNewFile2 {
    public static void main(String[] args) throws Exception {
        File path = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files\\fruit");
        System.out.printf("路徑是否存在: %b\n", path.exists());
        if(!path.exists()) {
            boolean check = path.mkdir(); // 建立路徑
            System.out.printf("建立路徑: %b\n", check);
            if(check) { // 建立路徑是否成功 ?
                File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files\\fruit\\apple.txt");
                System.out.printf("建立檔案: %b\n", file.createNewFile());
            }
        }
        
    }
}
