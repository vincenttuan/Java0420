package com.myjava.ocp.lab19;

import java.util.Random;
import java.util.concurrent.Callable;

class Lotto implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int n = new Random().nextInt(100);
        return n;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        
    }
}
