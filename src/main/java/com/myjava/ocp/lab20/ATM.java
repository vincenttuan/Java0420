package com.myjava.ocp.lab20;

class Account { // 資源物件(帳戶)
    private int money;
    public Account(int money) {
        this.money = money;
    }
    public void withdraw(int m) { // 提款
        String tName = Thread.currentThread().getName();
        // 取得帳戶餘額
        int tmpMoney = money;
        // 判斷帳戶餘額是否足夠 ?
        if(tmpMoney - m >= 0) {
            money = tmpMoney - m;
            System.out.printf("%s 提款 $%d 成功 餘額 $%d\n", tName, m, money);
        } else {
            System.out.printf("%s 提款 $%d 失敗(餘額不足) 餘額 $%d\n", tName, m, money);
        }
    }
}

class Withdraw implements Runnable { // 提款行為
    private int money;
    private Account account;

    public Withdraw(int money, Account account) {
        this.money = money;
        this.account = account;
    }
    
    @Override
    public void run() {
        account.withdraw(money);
    }
    
}

public class ATM {
    
}
