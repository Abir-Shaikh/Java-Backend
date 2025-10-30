package Collection_frameworks.Map.ConcurrentMap.ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class concurrentskiplistexample {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        // Adding elements
        map.put(3, "Apple");
        map.put(1, "Orange");
        map.put(5, "Banana");


        System.out.println("Map: " + map); // Output: Map: {1=Orange, 3=Apple, 5=Banana}

        // Retrieving elements
        System.out.println("Value for key 3: " + map.get(3)); // Output: Value for key 3: Apple

        // Range query
        System.out.println("Sub map from 2 to 4: " + map.subMap(2, 4)); // Output: Sub map from 2 to 4: {3=Apple}

        // Removing an element
        map.remove(1);
        System.out.println("Map after removing key 1: " + map); // Output: Map after removing key 1: {3=Apple, 5=Banana}
    }
}

