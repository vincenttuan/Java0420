package com.myjava.ocp.lab03;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        add(sb);
        System.out.println(sb);
        String s = "Java";
        s = add(s); // 要接回傳的 String 資料
        System.out.println(s);
    }
    
    public static String add(String s2) {
        s2 = s2.concat("8");
        return s2;
    }
    
//    public static void add(String s2) {
//        s2 = s2.concat("8");
//    }
    
    public static void add(StringBuilder sb2) {
        sb2.append("8");
    }
    
}
