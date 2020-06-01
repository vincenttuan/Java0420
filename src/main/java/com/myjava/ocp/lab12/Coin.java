package com.myjava.ocp.lab12;

public class Coin {
    private int money;

    public Coin(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Coin{" + "money=" + money + '}';
    }
    
}
