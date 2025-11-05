package Collection_frameworks.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetdemo {
    public static void main(String[] args) {
        //thread safe
        //copy-on-write mechanism
        //no duplicate elements
        //iterators do not reflect modifications

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 5; i++) {
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            // Attempting to modify the set during iteration
            copyOnWriteSet.add(6);
        }


        //we say concurrent skip list set is weakly consistent because when iterating it may or may not reflect which i may print or may not
        System.out.println("\nIterating and modifying ConcurrentSkipListSet:");
        for (Integer num : concurrentSkipListSet) {
            System.out.println("Reading from ConcurrentSkipListSet: " + num);
            // Attempting to modify the set during iteration
            concurrentSkipListSet.add(6);
        }
    }
}
