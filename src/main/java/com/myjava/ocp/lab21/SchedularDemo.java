package com.myjava.ocp.lab21;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedularDemo {
    public static void main(String[] args) throws Exception{
        int money = new Random().nextInt(100000);
        System.out.printf("匯款 $%d 元\n", money);
        Callable<Integer> callable = () -> money;
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<Integer> future = service.schedule(callable, 3, TimeUnit.SECONDS);
        System.out.printf("得到 $%d 元\n", future.get());
        service.shutdown();
    }
}
