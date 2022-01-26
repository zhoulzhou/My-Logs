package com.example.mylogs.produceconsume;

import java.util.Timer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockQueueTest {
    private static final LinkedBlockingQueue<KaoYa> queue = new LinkedBlockingQueue<>(1);

    public BlockQueueTest(){
        new Thread(new Producer(queue)).start();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }

    public class Producer implements Runnable{
        private LinkedBlockingQueue<KaoYa> mQueue;

        public Producer(LinkedBlockingQueue<KaoYa> mQueue) {
            this.mQueue = mQueue;
        }

        @Override
        public void run() {
            while (true){
                produce();
            }
        }

        private void produce(){
            try {
                KaoYa kaoYa = new KaoYa("kao");
                mQueue.put(kaoYa);
                System.out.println("produce  " + kaoYa.name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public class Consumer implements Runnable{
        private LinkedBlockingQueue<KaoYa> mQueue;

        public Consumer(LinkedBlockingQueue<KaoYa> mQueue) {
            this.mQueue = mQueue;
        }

        @Override
        public void run() {
            while (true){
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void consume(){
            try {
                KaoYa kaoYa = mQueue.take();
                System.out.println("consume ... " + kaoYa.name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
