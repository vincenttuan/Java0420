package com.myjava.ocp.lab06;

public class DrinkDemo {
    public static void main(String[] args) {
        Drink drink = new Drink("焦糖瑪奇朵", 60, 200);
        Drink drink2 = new Drink("拿鐵", 50, 300);
        Drink drink3 = new Drink("牛奶");
        drink3.price = 50;
        drink3.stock = 150;
        
        drink.sell(10);
        drink2.sell(20);
        System.out.println(drink);
        System.out.println(drink2);
        System.out.println(drink3);
    }
}
