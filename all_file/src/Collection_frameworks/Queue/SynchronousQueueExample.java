//package Collection_frameworks.Queue;
//
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.SynchronousQueue;
//
//public class SynchronousQueueExample {
//    public static void main(String[] args) {
//        BlockingQueue<String> queue = new SynchronousQueue<>();
//        //it means will be in ordered manner
//        //each insert operation must wait for a corresponding remove operation by another thread and vice versa
//        //it cannot store elements , capacity of at-most one element
//        Thread producer = new Thread(() -> {
//           try {
//               System.out.println("Producer is waiting to transfer...... ");
//               queue.put("Hello Producer !!!");
//               System.out.println("Producer has transfered the message....");
//           }
//           catch (InterruptedException e) {
//               Thread.currentThread().interrupt();
//               System.err.println("Producer was interrupted..");
//           }
//        });
//
//        Thread consumer = new Thread(() -> {
//            try {
//                System.out.println("consumer is waiting to transfer...... ");
//                queue.put("Hello consumer !!!");
//                System.out.println("consumer has transfered the message....");
//            }
//            catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                System.err.println("consumer was interrupted..");
//            }
//        });
//    }
//}

package Collection_frameworks.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();

        // Each insert must wait for a corresponding remove (no internal capacity)
        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting to transfer...");
                queue.put("Hello from Producer!!!");
                System.out.println("Producer has transferred the message.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted.");
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000); // delay a bit so producer waits
                System.out.println("Consumer is waiting to receive...");
                String msg = queue.take();
                System.out.println("Consumer received: " + msg);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted.");
            }
        });

        // Start both threads
        producer.start();
        consumer.start();
    }
}
