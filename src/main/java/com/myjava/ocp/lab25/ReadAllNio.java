package com.myjava.ocp.lab25;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllNio {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\data.txt");
        List<String> list = Files.readAllLines(path);
        System.out.println(list);
        Files.readAllLines(path)
                .stream()
                .parallel()
                .forEach(System.out::println);
    }
}
