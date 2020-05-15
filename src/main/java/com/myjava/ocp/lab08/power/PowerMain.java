package com.myjava.ocp.lab08.power;

import com.myjava.ocp.lab08.power.spec.Price;
import java.util.Arrays;

public class PowerMain {
    public static void main(String[] args) {
        // 計算出 Computer, Phone, BMW, ToyCar 的總成本(cost)
        Price[] prices = {new Computer(), new Phone(), new BMW(), new ToyCar()};
        // Java 7
        int sum = 0;
        for(Price p : prices) {
            sum += p.getCost();
        }
        System.out.println(sum);
        // Java 8
        int sum2 = Arrays.asList(prices).stream().mapToInt(Price::getCost).sum();
        System.out.println(sum2);
        // 試問哪一個商品最貴
        int maxCost = Arrays.asList(prices).stream().mapToInt(Price::getCost).max().getAsInt();
        
        Arrays.asList(prices)
                .stream()
                .filter(p -> p.getCost() == maxCost)
                .forEach(System.out::println); // p -> System.out.println(p)
        
    }
}
