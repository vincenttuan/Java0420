package com.myjava.ocp.lab20;

class Account { // 資源物件(帳戶)
   
    private int money;
    public Account(int money) {
        this.money = money;
    }
    public synchronized void withdraw(int m) { // 提款
        String tName = Thread.currentThread().getName();
        // 取得帳戶餘額
        int tmpMoney = money;
        // 模擬運作時間
        for(int i=0;i<Integer.MAX_VALUE;i++);
        // 判斷帳戶餘額是否足夠 ?
        if(tmpMoney - m >= 0) {
            money = tmpMoney - m;
            System.out.printf("%s 提款 $%d 成功 餘額 $%d\n", tName, m, money);
        } else {
            System.out.printf("%s 提款 $%d 失敗(餘額不足) 餘額 $%d\n", tName, m, money);
        }
    }
}

class Withdraw implements Runnable { // 提款行為(執行緒)
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

public class ATM { // 主程式
    public static void main(String[] args) {
        Account account = new Account(10000);
        Withdraw w1 = new Withdraw(5000, account);
        Withdraw w2 = new Withdraw(2000, account);
        Withdraw w3 = new Withdraw(4000, account);
        Thread t1 = new Thread(w1, "小明");
        Thread t2 = new Thread(w2, "小華");
        Thread t3 = new Thread(w3, "小英");
        t1.start();
        t2.start();
        t3.start();
    }
}
