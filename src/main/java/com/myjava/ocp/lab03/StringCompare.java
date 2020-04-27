package com.myjava.ocp.lab03;

public class StringCompare {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a'};
        String s1 = new String("Java");
        String s2 = new String(chars);
        String s3 = "Java";
        String s4 = "Java";
        System.out.printf("%s %s %s %s\n", s1, s2, s3, s4);
        System.out.println(s1 == s2); // 是否是指向同一個實體(比較的是 stack 的內容) 
        System.out.println(s1.equals(s2)); // 有分大小寫的比較
        System.out.println(s3 == s4); // 是否是指向同一個實體(比較的是 stack 的內容) 
        System.out.println(s3.equals(s4)); // 有分大小寫的比較
        System.out.println(s3.equalsIgnoreCase(s4)); // 不分大小寫的比較
    }
}
