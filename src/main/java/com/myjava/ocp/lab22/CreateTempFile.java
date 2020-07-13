package com.myjava.ocp.lab22;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {
    public static void main(String[] args) throws IOException  {
        File path = new File("src\\main\\java\\com\\myjava\\ocp\\lab22\\files");
        while (true) {            
            File file = File.createTempFile("temp", ".txt", path);
            //System.out.printf("暫存檔是否存在: %b\n", file.exists());
        }
    }
}
