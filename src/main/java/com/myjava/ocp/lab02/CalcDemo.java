package com.myjava.ocp.lab02;

import java.math.BigDecimal;

public class CalcDemo {
    public static void main(String[] args) {
        // 整數四則運算
        int x = 1 + 1 + 1;
        System.out.println(x == 3);
        // 浮點數四則運算
        double y = 0.1 + 0.1 + 0.1;
        System.out.println(y);
        System.out.println(y == 0.3);
        // 使用 BigDecimal 解決
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.1");
        BigDecimal b3 = new BigDecimal("0.1");
        BigDecimal b4 = b1.add(b2).add(b3);
        System.out.println(b4);
        System.out.println(b4.doubleValue() == 0.3);
    }
}
