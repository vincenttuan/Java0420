package com.myjava.ocp.lab10;

import java.util.Date;

class Teacher {
    private String name = "Mary " + new Date().getTime();
    private static final Teacher _instance = new Teacher();
    private Teacher() {

    }
    public String getName() {
        return name;
    }
}

public class SingleTon {
    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
        System.out.println(t.getName());
        Thread.sleep(100);
        Teacher t2 = new Teacher();
        System.out.println(t2.getName());
    }
}
