package com.myjava.ocp.lab04;

import java.util.Arrays;
import java.util.Random;

public class IDCheck_AutoGen {
    public static void main(String[] args) {
        while (true) {            
            String id = getId();
            System.out.print(id + " ");
            boolean idCheck = check(id);
            System.out.println(idCheck);
            if(idCheck) break;
        }
        
    }
    
    public static String getId() {
        String id = "A";
        id += new Random().nextInt(2) + 1;
        for(int i=0;i<8;i++) {
            id += new Random().nextInt(10);
        }
        return id;
    }
    
    public static boolean check(String id) {
        int[] idNums = new int[11];
        int[] delta = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
        for(int i=0;i<id.length();i++) {
            switch (id.charAt(i)) {
                case 'A':
                    idNums[0] = 1;idNums[1] = 0;
                    break;
                default: // 0~9
                    idNums[i+1] = id.charAt(i) - 48;
            }
        }
        // idNums * delta
        int sum = 0;
        for(int i=0;i<idNums.length;i++) {
            sum += idNums[i] * delta[i];
        }
        return sum % 10 == 0;
    }
}
