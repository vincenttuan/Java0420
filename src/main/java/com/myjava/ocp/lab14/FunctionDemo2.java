package com.myjava.ocp.lab14;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo2 {
    public static void main(String[] args) {
        // 1. Consumer
        Consumer<Integer> consumer = (t)->System.out.println(t + t);
        consumer.accept(10);
        consumer.accept(20);
        // 2. Function
        Function<Integer, Double> func = (t) -> t * t * 3.14;
        System.out.println(func.apply(5));
        System.out.println(func.apply(10));
        // 3. Predicate
        Predicate<Integer> pre = (t) -> t >= 60?true:false;
        System.out.println(pre.test(80));
        System.out.println(pre.test(40));
        // 4. Supplier
        Supplier<String> sup = () -> "20.8";
        System.out.println(sup.get());
        // 5. BiFunction
        BiFunction<Integer, Integer, Double> bf = (h, w) -> w / Math.pow(h/100.0, 2);
        System.out.printf("bmi: %.2f\n", bf.apply(170, 60));
        // 6. BinaryOperator (BinaryOperator extends BiFunction<T, T, T>)
        BinaryOperator<Double> bo = (h, w) -> w / Math.pow(h/100, 2);
        System.out.printf("bmi: %.2f\n", bo.apply(170.5, 60.3));
    }
    
    
}
