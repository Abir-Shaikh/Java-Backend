package Collection_frameworks.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
        //An implementation of the queue interface that supports lock-free , thread safe operations
        private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
        public static void main(String[] args) {

            Thread producer = new Thread(() -> {
                while (true) {
                    try {
                        taskQueue.add("Task " + System.currentTimeMillis());//Adds tasks (will use locks internally)
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            Thread consumer = new Thread(() -> {
                while (true) {
                    try {
                        String task = taskQueue.poll();//takes tasks (will use locks internally)
                        System.out.println("Processing: " + task);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            producer.start();
            consumer.start();


        }
    }
