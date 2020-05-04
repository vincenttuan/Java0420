package com.myjava.ocp.lab05;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console cs = System.console();
        System.out.println(cs);
        System.out.println("請輸入密碼:");
        String pass1 = cs.readLine();
        System.out.println("您輸入的密碼是: " + pass1);
        
        System.out.println("請輸入密碼:");
        char[] pass2 = cs.readPassword();
        System.out.println("您輸入的密碼是: " + new String(pass2));
    }
}
