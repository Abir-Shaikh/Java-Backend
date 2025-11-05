package Collection_frameworks.Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class set {
    public static void main(String[] args) {

        //What is set?
        /*Set is a collection that cannot contain duplicate elements
        They are based on the principles of Hashmap so, the Time complexity is O(1)
        so that means faster operation
        we saw earlier that Map has implementation like  [ Map --> HashMap , LinkedHashMap , TreeMap , EnumMap]
        so like that we will see same in the set [ Set --> HashSet , LinkedHashSet , TreeSet , EnumSet]
        * */

        //what is set --> its a interface and what is HashSet --> its a implementation class

        //internal working --> similar to hashmap
        //in set we can only store unique keys i.e. ids we cannot store value
        Set<Integer> set = new HashSet<>();//unordered
        set.add(12);
        set.add(1);
        set.add(3);
        set.add(1);
        System.out.println("Unordered Elements : " + set);

        Set<Integer> set1 = new LinkedHashSet<>();//ordered
        set1.add(12);
        set1.add(1);
        set1.add(3);
        set1.add(1);
        System.out.println("Ordered Elements : " + set1);


        //we can use multiple method and we will use and show it
        Set<Integer> set2 = new TreeSet<>();//Sorted
        set2.add(12);
        set2.add(1);
        set2.add(3);
        set2.add(1);
        System.out.println("Sorted Elements : " + set2);
        System.out.println(set2.contains(12));
        System.out.println(set2.remove(3));
        set2.clear();
        System.out.println(set2.isEmpty());
        for (int i : set2) {
            System.out.println(i);
        }

        //see when we are writing keyset the local variable which we are generating is by using set so we got the concept that the key is a unique thing in the maps or set
        Map<Integer , String> map = new HashMap<>();
        Set<Integer> integer = map.keySet();


        //for thread safety

        //1.we dont use synchronized because it is complicated and the terms like Red Black Tree and AVL Tree comes
        //Set<Integer> integerss = Collections.synchronizedSet(set2);

        //2.so thats why we use ConcurrentSkipListSet this implements navigable set so we can use navigableset as its reference

        NavigableSet<Integer> navigableSet = new ConcurrentSkipListSet<>();

    }
}
