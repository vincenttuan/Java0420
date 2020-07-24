package com.myjava.ocp.lab25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyAndDelete {
    public static void main(String[] args) {
        Path source = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\bar\\data.txt");
        Path dest   = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\foo\\data.txt");
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(source);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
