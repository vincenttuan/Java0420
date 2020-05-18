package com.myjava.ocp.lab09;

public class LottoDemo {
    public static void main(String[] args) {
        Lotto lotto1 = new FourStarLotto();
        int[] lottoNums = lotto1.getLotto(1, 9, 4);
        lotto1.printLotto(lottoNums);
    }
}
