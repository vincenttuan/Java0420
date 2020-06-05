package com.myjava.ocp.lab13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(100);
        q.offer(90);
        q.offer(80);
        System.out.println(q);
        // 取出
        while(q.size() > 0) {
            int n = q.poll();
            System.out.printf("取出 %d, q= %s\n", n, q);
        }
    }
}
