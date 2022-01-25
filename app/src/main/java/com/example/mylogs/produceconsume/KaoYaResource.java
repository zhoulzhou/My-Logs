package com.example.mylogs.produceconsume;

public class KaoYaResource {
    private String name;
    private int count = 1;
    private boolean flag = false; //是否有烤鸭

    public synchronized void produce(String name){
        if(false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.name = name + count;
        count++;
        flag = true;
        System.out.println(Thread.currentThread().getName() + "... 生产 ..." + this.name);
        notifyAll();
    }

    public synchronized void consume(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "... 消费 ..." + this.name);
        flag = false;
        notifyAll();
    }
}
