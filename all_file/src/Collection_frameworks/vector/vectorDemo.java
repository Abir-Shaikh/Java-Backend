package Collection_frameworks.vector;

import java.util.LinkedList;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {

        //create a vector
        //methods in vector
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);
    }
}
