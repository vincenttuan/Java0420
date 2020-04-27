package com.myjava.ocp.lab03;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java").append("8").append("OCPJP");
        String s = "Java8OCPJP";
        System.out.println(sb); // sb.toString()
        System.out.println(s);
        System.out.println(sb.equals(s));
        System.out.println(sb.toString().equals(s));
    }
}
