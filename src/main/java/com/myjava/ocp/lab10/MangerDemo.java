package com.myjava.ocp.lab10;

public class MangerDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.job();
        
        Manager.Sales sales = m.new Sales();
        sales.job();
        
        
    }
}
