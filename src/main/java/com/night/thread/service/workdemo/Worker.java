package com.night.thread.service.workdemo;

import java.util.concurrent.CountDownLatch;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/3/2 16:21
 */
public class Worker implements Runnable {

    private String wockerName;

    private  CountDownLatch countDownLatch ;

    public Worker(String wockerName, CountDownLatch countDownLatch) {
        this.wockerName = wockerName;
        this.countDownLatch = countDownLatch;
    }

    public void run() {

        System.out.println(wockerName +"is working");

        try {
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(wockerName +"is over");
        this.countDownLatch.countDown();
    }
}
