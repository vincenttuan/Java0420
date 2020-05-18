package com.myjava.ocp.lab09;

public abstract class ALotto implements Lotto {

    @Override
    public void printLotto(int [] lotto) {
        for(int i=0;i<lotto.length;i++) {
            System.out.printf("%d ", lotto[i]);
        }
        System.out.println();
    }
    
}
