package Collection_frameworks.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExampool {
    public static void main(String[] args) {
        //what is deque ? --> double ended queue
        //allows insertion and removal of elements from both ends
        //but in queue u can insert the elements from the rear and remove it from the front .
        //versatile than regular queues and stacks because they support all the operations of both

        /*
        Insertion Methods :
        addFirst(E e) : Insert the specified elements at the front.
        addLast(E e) : Inserts the specified element at the end.
        offerFirst(E e) : Inserts the specified elements at the front if possible.
        offerLast(E e) : Inserts the specified element at the end if possible.
        */

        /*
        Removal Methods:
        removeFirst() : Retrieves and removes the first element
        removeLast() : Retrieves and removes the last Element .
        pollFirst() : Retrieves and removes the first element , or returns null if empty.
        pollLast() : Retrieves and removes the last Element, or returns null if empty.
        */

        /*
        Examination Methods :
        getFirst() : Retrieves, but does not remove , the first element.
        getLast() : Retrieves , but does not remove the last element
        peekFirst() : Retrieves, but does not remove the first element or returns null if empty
        peekLast() : Retrieves, but does not remove the last element or returns null if empty
        */


        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(40);
        deque.addFirst(45);
        deque.offerFirst(90);
        deque.offerLast(80);
        System.out.println("Elements before operation : ");
        System.out.println(deque);
        System.out.println("First Element : " + deque.getFirst());
        System.out.println("Last Element : " + deque.getLast());
        System.out.println("First element removed : "+deque.removeFirst());
        System.out.println("Last Element removed : "+deque.removeLast());
        System.out.println("The Size of the deque is : "+deque.size());
        for (int i : deque){
            System.out.println("Remaining element in the deque is : "+i);
        }

        //its same then why introducing linkedList its because in array deque it has low memory but fast iteration , no null allowed and the array deque is like circular queue u can say
        //no need to shift element just shift head and tail in array deque .
        //we will use linkedlist when we have to insert , delete somewhere in middle

        Deque<Integer> deque1 = new LinkedList<>();
        deque1.addFirst(40);
        deque1.addFirst(45);
        deque1.offerFirst(90);
        deque1.offerLast(80);
        System.out.println("\nElements before operation : ");
        System.out.println(deque1);
        System.out.println("First Element : " + deque1.getFirst());
        System.out.println("Last Element : " + deque1.getLast());
        System.out.println("First element removed : "+deque1.removeFirst());
        System.out.println("Last Element removed : "+deque1.removeLast());
        System.out.println("The Size of the deque is : "+deque1.size());
        for (int i : deque1){
            System.out.println("Remaining element in the deque is : "+i);
        }
    }
}
