package Collection_frameworks.linkedlist;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //string
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Bmw");
        cars.add("Mercedes");
        cars.add("Lund");
        cars.remove(1);
        cars.get(1);

        //integer
        System.out.println(cars);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(8);
        linkedList.get(2);
        linkedList.addFirst(3);
        linkedList.addLast(9);
        linkedList.removeFirst();
        linkedList.getFirst();
        System.out.println(linkedList);
    }
}
