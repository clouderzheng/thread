package com.night.thread.test;

import com.night.thread.service.workdemo.Boos;
import com.night.thread.service.workdemo.Worker;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author night
 * @version 1.1.0
 * @Date 2020/3/2 16:28
 */
public class TestWorker {

    @Test
    public void testWoker() throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Boos(countDownLatch));
        executorService.execute(new Worker("张三",countDownLatch));
        executorService.execute(new Worker("李四",countDownLatch));
        executorService.execute(new Worker("王五",countDownLatch));
        countDownLatch.await();
        executorService.shutdown();
        System.out.println("关了");
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Boos(countDownLatch));
        executorService.execute(new Worker("张三",countDownLatch));
        executorService.execute(new Worker("李四",countDownLatch));
        executorService.execute(new Worker("王五",countDownLatch));
        executorService.shutdown();
    }
}
