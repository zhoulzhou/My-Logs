package com.example.mylogs.callfutrue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public CallableTest(){

        //创建线程池
        ExecutorService es = Executors.newSingleThreadExecutor();

        //创建callTask
        CallableDemo callTask = new CallableDemo();

        //创建futureTask
        FutureTask<Integer> futureTask = new FutureTask<>(callTask);

        //执行任务
        es.submit(futureTask);

        //关闭线程池
        es.shutdown();

        try {
            System.out.println("主线程执行此次任务");

            Thread.sleep(2000);
            System.out.println("主线程执行其他任务");

            //输出获取到的结果
            if(futureTask.get() != null){
                System.out.println("futureTask.get() = " + futureTask.get());
            }else {
                System.out.println("futureTask.get() 未获取到结果");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("主线程在执行任务");
    }




}
