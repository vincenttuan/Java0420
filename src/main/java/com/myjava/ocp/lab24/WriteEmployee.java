package com.myjava.ocp.lab24;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Vincent", 80000);
        String path = "src\\main\\java\\com\\myjava\\ocp\\lab24\\emp.bin";
        // 序列化寫入
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            // 寫入物件
            oos.writeObject(emp);
            System.out.println("寫入完成");
        } catch (Exception e) {
        }
    }
}
