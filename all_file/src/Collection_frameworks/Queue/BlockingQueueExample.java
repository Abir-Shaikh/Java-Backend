package Collection_frameworks.Queue;


//hte methods we have studied so far is not thread safe like --> Queue, LinkedList, PriorityQueue, Deque --> so that's why BlockingQueue was introduced.

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    public static void main(String[] args) {
        //A bounded , blocking queue backed by an array
        //cannot instantiate that why we have wriyyen its implementation class
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread produecer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new ConsumerThread(queue));
        produecer.start();
        consumer.start();
    }
    //thread safe queue
    //wait for queue to become non-empty / wait for space
    //simplify concurrency problems like producer-Consumer
    //standard queue --> immediately
    //if empty --> and we r trying to remove it will not wait it will go and remove
    //full --> like that in remove it will just go and add no waiting

    //Blocking Queue
        /*
        put --> blocks if the queue is full until space becomes available.
        take --> blocks if the queue is empty until an element becomes available.
        offer --> waits for space to become available, up to specified timeout.
        */



}

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Producer produced : " + value);
                queue.put(value++);
                Thread.sleep(500);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted : ");
            }
        }
    }
}



class ConsumerThread implements Runnable {
    private BlockingQueue<Integer> queue;
//    private int value = 0;

    public ConsumerThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Integer value = queue.take();
                System.out.println("Consumer Consumed : " + value);
                queue.put(value);
                Thread.sleep(1000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted : ");
            }
        }
    }
}