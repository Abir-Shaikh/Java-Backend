package Collection_frameworks.Queue;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(11 , Comparator.reverseOrder());
        //binary heap as array and can grow dynamically
        //Head is based on their natural ordering or a provided comparator like priority Queue
        //Unbounded , so put won't block
        queue.add(5);
        queue.add(4);
        queue.add(23);
        System.out.println(queue);
    }
}
