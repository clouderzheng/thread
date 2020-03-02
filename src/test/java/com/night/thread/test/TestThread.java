package com.night.thread.test;

import com.night.thread.service.StudentService;
import com.night.thread.service.TeacherService;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/3/2 16:09
 */
public class TestThread {

//    @Test
//    public  void testCountDownLatch(){
//
//        new TeacherService().start();
//        new StudentService("night").start();
//        new StudentService("tom").start();
//
//    }

    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(2);
        new TeacherService(countDownLatch).start();
        new StudentService("night",countDownLatch).start();
        new StudentService("tom",countDownLatch).start();
    }
}
