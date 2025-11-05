package Java8.Collectors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i : list){
            System.out.println(i);
        }

        //this method help us iterate
        //if there's hasNext print next
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //taking another example
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        //we can use for loop but if we use new ArrayList we will get a exception i.e. ConcurrentException so we had to use CopyOnWriteArrayList to avoid any Exception
        //but in iterator we dont have to write any other method we can access our element through arrayList

        Iterator<Integer> iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            Integer num = iterator1.next();
            if (num %2 == 0) {
                iterator1.remove();
            }
        }
        System.out.println(list1);

        //what is list Iterator?
        //it is a interface that allows you to iterate through a list. It is a more powerful version of Iterator like we get to access more functions
        ListIterator<Integer> integerListIterator = list1.listIterator();
        while (integerListIterator.hasNext()){
            integerListIterator.set(1);
        }
    }
}
