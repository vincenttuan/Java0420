package com.myjava.ocp.lab25;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.text.DecimalFormat;

public class FileStoreDemo {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = FileSystems.getDefault();
        Iterable<FileStore> fileStores = fileSystem.getFileStores();
        DecimalFormat format = new DecimalFormat("###,###");
        for(FileStore store : fileStores) {
            System.out.println(store + "\t容量:" + 
                    format.format(store.getTotalSpace()) + " bytes");
        }
    }
}
