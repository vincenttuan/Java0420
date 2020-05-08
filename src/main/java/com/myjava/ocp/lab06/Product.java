package com.myjava.ocp.lab06;

public class Product {
    static int stock; // 庫存
    void sell(int amount) {
        stock -= amount;
    }
    void buy(int amount) {
        stock += amount;
    }
}
