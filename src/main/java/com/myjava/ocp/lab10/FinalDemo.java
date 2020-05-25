package com.myjava.ocp.lab10;

class Student {
    String name;
}

public class FinalDemo {
    public static void main(String[] args) {
        final int x = 100;
        final Student s = new Student();
        s.name = "John";
        s.name = "Mary";
        System.out.println(x);
        System.out.println(s.name);
    }
}
