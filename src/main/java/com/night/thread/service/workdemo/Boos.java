package com.night.thread.service.workdemo;

import java.util.concurrent.CountDownLatch;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/3/2 16:24
 */
public class Boos implements  Runnable {

    private  CountDownLatch countDownLatch;

    public Boos(CountDownLatch countDownLatch) {

        this.countDownLatch = countDownLatch;
    }

    public void run() {

        System.out.println("boos is plan task");
        try {
            this.countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("boos is go to check");
    }
}
