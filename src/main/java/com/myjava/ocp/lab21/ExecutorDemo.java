package com.myjava.ocp.lab21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;

// 報時器
class MyTime implements Runnable {
    @Override
    public void run() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.printf("現在時間: %s\n", sdf.format(now));
    }
}

class MyExecutor implements Executor {

    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        MyExecutor exec = new MyExecutor();
        exec.execute(new MyTime());
        exec.execute(new MyTime());
        exec.execute(new MyTime());
    }
}
