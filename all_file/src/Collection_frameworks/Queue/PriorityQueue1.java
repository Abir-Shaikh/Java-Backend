package Collection_frameworks.Queue;


import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        //its a part of queue interface
        //order elements based on their natural ordering (for primitive lowest first)
        //custom comparator for customised ordering
        //does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(25);
        pq.add(15);
        pq.add(5);
//        System.out.println(pq.remove());
        System.out.println(pq.peek());
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        System.out.println("After removing all the elements : "+pq.peek());

        //internal working
        //Priority Queue is implemented as a min-heap by default (for natural ordering) if we want to reverse the order its very easy just use comparator.reverseOrder()

    }
}
