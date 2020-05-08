package com.myjava.ocp.lab06;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.buy(10);
        p1.sell(5);
        System.out.println(p1.stock);
        Product p2 = new Product();
        p2.sell(3);
        System.out.println(p2.stock);
    }
}
