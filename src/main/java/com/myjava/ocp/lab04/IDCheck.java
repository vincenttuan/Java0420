package com.myjava.ocp.lab04;

import java.util.Arrays;

public class IDCheck {
    public static void main(String[] args) {
        String id = "A123456789"; //"M140051653";
        // 2 1 1 4 0 0 5 1 6 5 3
        int[] idNums = new int[11];
        int[] delta = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        
        for(int i=0;i<id.length();i++) {
            switch (id.charAt(i)) {
                case 'A':
                    idNums[0] = 1;idNums[1] = 0;
                    break;
                case 'M':
                    idNums[0] = 2;idNums[1] = 1;
                    break;
                default: // 0~9
                    idNums[i+1] = id.charAt(i) - 48;
            }
        }
        
        Arrays.stream(idNums).forEach(System.out::print);
        System.out.println();
        // idNums * delta
        int sum = 0;
        for(int i=0;i<idNums.length;i++) {
            sum += idNums[i] * delta[i];
        }
        System.out.println(sum);
        System.out.println(sum % 10 == 0 ? "合法" : "不合法");
    }
    
    
}
