package com.myjava.ocp.lab09;

public class LottoDemo {
    public static void main(String[] args) {
        Lotto lotto1 = new FourStarLotto();
        int[] lottoNums1 = lotto1.getLotto(1, 9, 4);
        lotto1.printLotto(lottoNums1);
        
        Lotto lotto2 = new BigLotto();
        int[] lottoNums2 = lotto2.getLotto(1, 49, 6);
        lotto2.printLotto(lottoNums2);
    }
}
