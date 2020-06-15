package com.myjava.ocp.lab16;

import java.util.Scanner;

public class CalcDiv {
    public static void main(String[] args) {
        // 分子
        int x = 10;
        // 分母
        int[] y = {2, 5, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇分母 0->2, 1->5, 2->0 : ");
        int idx = sc.nextInt();
        int z = 0;
        z = x / y[idx];
        System.out.printf("%d / %d = %d\n", x, y[idx], z);
    }
}
