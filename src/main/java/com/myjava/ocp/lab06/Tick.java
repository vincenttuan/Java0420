package com.myjava.ocp.lab06;

import java.util.Date;

public class Tick {
    String name;
    int n;
    static int stock;
    
    static { //  static 成員初始區段
        stock = 100;
    }
    
    { // 建構子初始化區段
        n = new Date().getTime() % 2 == 0 ? 2 : 1;
    }
    
    public Tick() {
        name = "無名氏";
    }
    
    public Tick(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tick{" + "name=" + name + ", n=" + n + '}';
    }
    
    
}
