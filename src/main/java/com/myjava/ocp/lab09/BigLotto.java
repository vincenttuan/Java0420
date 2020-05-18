package com.myjava.ocp.lab09;

import java.util.Random;

public class BigLotto implements Lotto {
    
    private boolean isExist(int[] nums, int n) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == n) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int[] getLotto(int begin, int end, int count) {
        Random r = new Random();
        int[] lotto = new int[count];
        for(int i=0;i<lotto.length;) {
            int n = r.nextInt(end - begin + 1) + begin;
            if(!isExist(lotto, n)) {
                lotto[i] = n;
                i++;
            } else {
                continue;
            }
            
        }
        return lotto;
    }

    @Override
    public void printLotto(int [] lotto) {
        for(int i=0;i<lotto.length;i++) {
            System.out.printf("%d ", lotto[i]);
        }
        System.out.println();
    }
    
}
