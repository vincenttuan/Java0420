package com.myjava.ocp.lab25;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchApp extends SimpleFileVisitor<Path> {

    private final PathMatcher matcher;

    SearchApp() {
        matcher = FileSystems.getDefault().
                getPathMatcher("glob:*.{htm,txt,xml}");
    }

    private void search(Path file) {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            System.out.print("比對成功:" + name + "\t");
            System.out.println("完整路徑:" + file);
        }
    }
    
    @Override
    public FileVisitResult visitFile(Path file,
            BasicFileAttributes attrs) {
        search(file);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("C:\\Users\\teacher\\Documents\\NetBeansProjects"), new SearchApp());
    }
}
