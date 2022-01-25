package com.example.mylogs.produceconsume;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class KaoYaResourceByLock2Condition {
    private String name;
    private int count = 1;
    private boolean flag = false; //是否有烤鸭

    private Lock lock = new ReentrantLock();
    private Condition producer_condition = lock.newCondition();
    private Condition consumer_condition = lock.newCondition();

    public void produce(String name){
        lock.lock();
        try {
            while (flag){
                try {
                    producer_condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.name = name + count;
            count++;
            flag = true;
            System.out.println(Thread.currentThread().getName() + "... 生产 ..." + this.name);
            consumer_condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public void consume(){
        lock.lock();
        try {
            while (!flag){
                try {
                    consumer_condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + "... 消费 ..." + this.name);
            flag = false;
            producer_condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
