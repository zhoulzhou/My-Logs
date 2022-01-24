package com.example.mylogs.callfutrue;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    private int sum;

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable 子线程开始计算啦 ---");
        Thread.sleep(5000);

        for(int i=0; i<5000; i++){
            sum = sum + i;
        }
        System.out.println("Callable 子线程开始计算结束啦 ---");
        return sum;
    }
}
