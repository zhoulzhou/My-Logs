package com.example.mylogs.produceconsume;

public class KaoYaMultiThreadTest {

    public KaoYaMultiThreadTest(){
        KaoYaResourceByLock r = new KaoYaResourceByLock();
        Producer p1 = new Producer(r);
        Producer p2 = new Producer(r);
        Consumer c1 = new Consumer(r);
        Consumer c2 = new Consumer(r);

        Thread p1t = new Thread(p1);
        Thread p2t = new Thread(p2);
        Thread c1t = new Thread(c1);
        Thread c2t = new Thread(c2);

        p1t.start();
        p2t.start();
        c1t.start();
        c2t.start();
    }

    class Producer implements Runnable{
        private KaoYaResourceByLock r;

        Producer(KaoYaResourceByLock r){
            this.r = r;
        }

        @Override
        public void run() {
            while (true){
                r.produce("北京烤鸭multi... ");
            }
        }
    }

    class Consumer implements Runnable{
        private KaoYaResourceByLock r;

        Consumer(KaoYaResourceByLock r){
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
