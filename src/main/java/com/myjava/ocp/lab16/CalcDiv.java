package com.myjava.ocp.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDiv {
    public static void main(String[] args) {
        // 分子
        int x = 10;
        // 分母
        int[] y = {2, 5, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("請選擇分母 0->2, 1->5, 2->0 : ");
        try {
            int idx = sc.nextInt();
            int z = 0;
            z = x / y[idx];
            System.out.printf("%d / %d = %d\n", x, y[idx], z); 
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("陣列錯誤:" + e);
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤, 請輸入數字");
        } catch (Exception e) {
            System.out.println("其他錯誤");
            e.printStackTrace(System.out);
        }
        
    }
}
