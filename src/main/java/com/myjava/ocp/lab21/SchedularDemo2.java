package com.myjava.ocp.lab21;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedularDemo2 {
    
    public static void main(String[] args) {
        Runnable r = () -> {
            Date date = new Date();
            int n = new Random().nextInt(9) + 1;
            System.out.printf("%d %s\n", n, date.toString());
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(r, 1, 3, TimeUnit.SECONDS);
    }
}
