package com.night.thread.service;

import java.util.concurrent.CountDownLatch;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/3/2 16:04
 */
public class StudentService extends  PersonThreadService {

    private String name;

    private CountDownLatch countDownLatch;
    public StudentService(String name,CountDownLatch studentCountDownLatch) {
        this.countDownLatch = studentCountDownLatch;
        this.name = name;
    }


    @Override
    public void run() {

        System.out.println(name +" go to class" );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name +"  go to home");
        this.countDownLatch.countDown();
    }
}
