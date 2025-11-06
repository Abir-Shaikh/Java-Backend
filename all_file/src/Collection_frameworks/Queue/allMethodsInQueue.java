package Collection_frameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class allMethodsInQueue {
    public static void main(String[] args) {
        Queue<Integer> values = new LinkedList<>();
        values.add(1);
        System.out.println(values.size());

        //they both do same work
        System.out.println(values.remove());//throws exception if empty
        System.out.println(values.poll());

        //they both do same work
        System.out.println(values.peek());
        //System.out.println(values.element());//throws exception if empty

        //there are many implementation class in queue so we will read that one by one
        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1));//true
        System.out.println(queue1.add(2));//true
        System.out.println(queue1.offer(3));//false
    }
}
