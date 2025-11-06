package Collection_frameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //so what is Queue ? --> Its a data structure which works on FIFO concept i.e. first in first out
        //Elements are added at the end and removed from the front.
        //we can use linked list to perform both stack and queue


        //we are performing stack here which is following LIFO principle.
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(1);
        integers.addFirst(4);
        integers.addFirst(9);
        integers.addFirst(6);
        System.out.println(integers);

        //we are performing Queue here which is following FIFO principle.
        LinkedList<Integer> queueintger = new LinkedList<>();

        //enqueue
        queueintger.addLast(1);
        queueintger.addLast(4);
        queueintger.addLast(9);
        queueintger.addLast(6);
        System.out.println(queueintger);

        //dequeue
        Integer i = queueintger.removeFirst();
        System.out.println(queueintger);

        //peek
        Integer first = queueintger.getFirst();
        System.out.println(first);


        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(4);
        integerQueue.add(9);
        integerQueue.add(6);
        System.out.println("\n using queue interface");
        System.out.println("Done by queue : "+integerQueue);

        //we are performing Queue here which is following FIFO principle.
        Queue<Integer> queueinteger = new LinkedList<>();

        //enqueue
        queueinteger.add(1);
        queueinteger.add(4);
        queueinteger.add(9);
        queueinteger.add(6);
        System.out.println(queueinteger);

        //dequeue
        Integer remove = queueinteger.remove();
        System.out.println(remove);

        //peek
        Integer peek = queueinteger.peek();
        System.out.println(peek);

    }
}
