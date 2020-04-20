package com.myjava.ocp.lab01;

import java.util.stream.Stream;

public class MaskSystem2 {
    public static void main(String[] args) {
        Mask m1 = new Mask("Red", true);
        Mask m2 = new Mask("Red", false);
        Mask m3 = new Mask("Blue", true);
        
        // Java 8 串流(Stream)分析
        Stream.of(m1, m2, m3).forEach(m -> {
            System.out.printf("color: %s price: %d %s\n", m.getColor(), Mask.price, m.isChild()?"兒童":"成人");
        });
        
    }
}
