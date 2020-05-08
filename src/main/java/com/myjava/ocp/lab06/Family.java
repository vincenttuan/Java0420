package com.myjava.ocp.lab06;

class Mother {
    Mother(int x) {
        System.out.println("Mother 的紅包 $" + x);
    }
}

class Son extends Mother {
    Son() {
        this(10000);
    }
    Son(int x) {
        super(x);
    }
}

public class Family {
    public static void main(String[] args) {
        new Son();
        new Son(5000);
    }
}
