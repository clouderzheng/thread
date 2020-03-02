package com.night.thread.service;

import java.util.concurrent.CountDownLatch;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/3/2 15:56
 */
public class TeacherService extends  PersonThreadService {

    private CountDownLatch countDownLatch ;

    public TeacherService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("teacher begin to teach");

        try {

            countDownLatch.await();
        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println("teacher teaches over");


    }
}
