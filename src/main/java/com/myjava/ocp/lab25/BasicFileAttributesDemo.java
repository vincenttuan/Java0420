package com.myjava.ocp.lab25;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\myjava\\ocp\\lab25\\logo.gif");
        BasicFileAttributes attr = 
                Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(path);
        System.out.println("size:" + attr.size());
        System.out.println("isDirectory:" + attr.isDirectory());
        System.out.println("isRegularFile:" + attr.isRegularFile());
        System.out.println("isSymbolicLink:" + attr.isSymbolicLink());
        System.out.println("isOther:" + attr.isOther());
        System.out.println("lastAccessTime:" + attr.lastAccessTime());
        System.out.println("lastModifiedTime:" + attr.lastModifiedTime());        
        System.out.println("lastModifiedTime:" + Files.getLastModifiedTime(path));        
    }
}
