package com.myjava.ocp.lab04;

import java.util.Arrays;

public class IDCheck {
    public static void main(String[] args) {
        String id = "M140051653";
        // 2 1 1 4 0 0 5 1 6 5 3
        int[] idNums = new int[11];
        for(int i=0;i<id.length();i++) {
            switch (id.charAt(i)) {
                case 'M':
                    idNums[0] = 2;idNums[1] = 1;
                    break;
            }
        }
        
        Arrays.stream(idNums).forEach(System.out::print);
        
    }
    
    
}
