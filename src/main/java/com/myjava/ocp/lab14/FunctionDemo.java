package com.myjava.ocp.lab14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {
    public static void main(String[] args) {
        // 1. Consumer
        Consumer<Integer> consumer = (t)->System.out.println(t + t);
        play(10, consumer);
        // 2. Function
        Function<Integer, Double> func = (t) -> t * t * 3.14;
        System.out.println(play(10, func));
        // 3. Predicate
        Predicate<Integer> pre = (t) -> t >= 60?true:false;
        System.out.println(play(80, pre));
        System.out.println(play(40, pre));
    }
    
    public static void play(int x, Consumer consumer) {
        consumer.accept(x);
    }
    
    public static Object play(int x, Function function) {
        return function.apply(x);
    }
    
    public static Boolean play(int x, Predicate predicate) {
        return predicate.test(x);
    }
}
