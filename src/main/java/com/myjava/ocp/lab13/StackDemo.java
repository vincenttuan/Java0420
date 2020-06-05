package com.myjava.ocp.lab13;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(90);
        stack.push(80);
        System.out.println(stack);
        while(stack.size() > 0) {
            int n = stack.pop();
            System.out.printf("取出 %d, stack= %s\n", n, stack);
        }
        
    }
}
