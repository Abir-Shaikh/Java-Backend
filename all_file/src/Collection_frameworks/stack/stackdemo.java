package Collection_frameworks.stack;

import java.util.Iterator;
import java.util.Stack;

public class stackdemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(stack);

        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);
        System.out.println(search);

        //another way to implement data in a stack
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
        stack.pop();
        stack.size();
    }
}
