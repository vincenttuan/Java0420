package com.myjava.ocp.lab09;

import java.util.Random;

public class FourStarLotto extends ALotto {
    
    @Override
    public int[] getLotto(int begin, int end, int count) {
        Random r = new Random();
        int[] lotto = new int[count];
        for(int i=0;i<lotto.length;i++) {
            lotto[i] = r.nextInt(end - begin + 1) + begin;
        }
        return lotto;
    }

}
