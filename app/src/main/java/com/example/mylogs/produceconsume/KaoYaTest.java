package com.example.mylogs.produceconsume;

public class KaoYaTest {
    public KaoYaTest(){
        KaoYaResource r = new KaoYaResource();
        Producer p1 = new Producer(r);
        Consumer c1 = new Consumer(r);

        Thread p1t = new Thread(p1);
        Thread c1t = new Thread(c1);

        p1t.start();
        c1t.start();
    }

    class Producer implements Runnable{
        private KaoYaResource r;

        Producer(KaoYaResource r){
            this.r = r;
        }

        @Override
        public void run() {
            while (true){
                r.produce("北京烤鸭");
            }
        }
    }

    class Consumer implements Runnable{
        private KaoYaResource r;

        Consumer(KaoYaResource r){
            this.r = r;
        }

        @Override
        public void run() {
            while (true){
                r.consume();
            }
        }
    }
}
