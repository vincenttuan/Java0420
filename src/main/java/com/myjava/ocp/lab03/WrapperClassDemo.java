package com.myjava.ocp.lab03;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        String r = "10.2"; // 半徑
        double r2 = Double.parseDouble(r); // String 轉 double
        System.out.println(Math.pow(r2, 2) * Math.PI);
        //---------------------------------------------
        int x = 100;
        Integer y = Integer.valueOf(200); // new Integer(200)
        System.out.println(x + y.intValue());
        //----------------------------------------------
        int x2 = 100;
        Integer y2 = 200; // auto-boxing Integer.valueOf(200);
        y2 = 300;
        System.out.println(x2 + y2); // auto-unboxing y2.intValue()
        
    }
}
