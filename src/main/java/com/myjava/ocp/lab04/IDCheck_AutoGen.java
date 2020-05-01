package com.myjava.ocp.lab04;

import java.util.Random;

public class IDCheck_AutoGen {
    public static void main(String[] args) {
        String id = getId();
        System.out.println(id);
    }
    
    public static String getId() {
        String id = "A";
        id += new Random().nextInt(2) + 1;
        for(int i=0;i<8;i++) {
            id += new Random().nextInt(10);
        }
        return id;
    }
}
