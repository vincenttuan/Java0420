package com.myjava.ocp.lab25;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File2Path {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\java\\com\\myjava\\ocp\\lab25\\data.txt");
        Path path = file.toPath();
        byte[] bytes = Files.readAllBytes(path);
        String data = new String(bytes, "UTF-8");
        System.out.println(data);
        
    }
}
