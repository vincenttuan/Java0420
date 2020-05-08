package com.myjava.ocp.lab06;

public class Drink {
    String name;
    int price;
    int stock;

    public Drink(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Drink(String name) {
        this.name = name;
    }
    
    public void sell(int amount) {
        stock -= amount;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + ", stock=" + stock + '}';
    }

    
    
}
