package Collection_frameworks.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        //optionally bounded backed by LinkedList
        //uses two separate locks for enqueue and dequeue operations
        //Higher concurrency between producers and consumers

    }
}
