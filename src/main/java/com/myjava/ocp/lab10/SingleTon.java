package com.myjava.ocp.lab10;

import java.util.Date;

class Teacher {
    private String name = "Mary " + new Date().getTime();
    // 自行提供(new) Teacher 物件實體 -> _instance
    private static final Teacher _instance = new Teacher();
    // 將建構子設為 private
    private Teacher() {

    }
    public String getName() {
        return name;
    }
    // 透過該方法將 Teacher 物件實體 傳出
    public static Teacher getInstance() {
        return _instance;
    }
}

public class SingleTon {
    public static void main(String[] args) throws Exception {
        Teacher t = Teacher.getInstance();
        System.out.println(t.getName());
        Thread.sleep(100);
        Teacher t2 = Teacher.getInstance();
        System.out.println(t2.getName());
    }
}
