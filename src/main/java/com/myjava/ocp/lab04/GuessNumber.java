package com.myjava.ocp.lab04;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int ans = new Random().nextInt(99) + 1;
        int min = 0, max = 100;
        do { 
            // user 猜
            System.out.printf("%d ~ %d 之間猜一數字?\n", min, max);
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            
            if(guess <= min || guess >= max) {
                continue;
            }
            
            if(guess > ans) {
                max = guess;
            } else if (guess < ans) {
                min = guess;
            } else {
                System.out.println("user 答對了");
                break;
            }
            // pc 猜
            System.out.printf("%d ~ %d 之間猜一數字?\n", min, max);
            guess = new Random().nextInt(max - min - 1) + min + 1;
            System.out.printf("pc 猜: %d\n", guess);
            if(guess > ans) {
                max = guess;
            } else if (guess < ans) {
                min = guess;
            } else {
                System.out.println("pc 答對了");
                break;
            }
        } while (true);
    }
}
