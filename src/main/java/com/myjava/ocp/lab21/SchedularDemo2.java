package com.myjava.ocp.lab21;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedularDemo2 {
    
    public static void main(String[] args) {
        Runnable r = () -> {
            int delay = new Random().nextInt(5000);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            int n = new Random().nextInt(9) + 1;
            System.out.printf("%d 產生號碼所花的秒數 %.1f, 列印時間: %s\n", n, delay/1000.0, new Date());
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(r, 1, 3, TimeUnit.SECONDS);
    }
}
