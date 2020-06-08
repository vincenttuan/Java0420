package com.myjava.ocp.lab14;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> exam = new HashMap<>();
        exam.put("國文", 100);
        exam.put("數學", 80);
        exam.put("英文", 100);
        System.out.println(exam);
        System.out.println(exam.get("國文"));
        System.out.println(exam.keySet()); // Set
        System.out.println(exam.values()); // List
        // Java 7
        Set<String> keys = exam.keySet();
        for(String key : keys) {
            System.out.printf("key: %s value: %d\n", key, exam.get(key));
        }
    }
}
