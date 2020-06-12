package com.myjava.ocp.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberException {
    public static void main(String[] args) {
        System.out.println("請輸入一個數字: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            System.out.println("您輸入的是: " + num);
        } catch (InputMismatchException e) {
            System.out.println("錯誤訊息: " + e);
            System.out.println("錯誤訊息: " + e.getMessage());
            System.out.println("您輸入的不是數字, 請重新輸入.");
            main(null);
        }
        
    }
}
