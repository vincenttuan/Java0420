package com.myjava.ocp.lab20;

class Account {
    private int money;
    public Account(int money) {
        this.money = money;
    }
    public void withdraw(int m) { // 提款
        String tName = Thread.currentThread().getName();
        // 取得帳戶餘額
        int tmpMoney = money;
        if(tmpMoney - m >= 0) {
            money = tmpMoney - m;
            System.out.printf("%s 提款 $%d 成功 餘額 $%d\n", tName, m, money);
        } else {
            System.out.printf("%s 提款 $%d 失敗(餘額不足) 餘額 $%d\n", tName, m, money);
        }
    }
}

public class ATM {
    
}
