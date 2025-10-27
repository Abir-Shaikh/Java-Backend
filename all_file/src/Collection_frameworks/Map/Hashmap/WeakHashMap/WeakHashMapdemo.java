package Collection_frameworks.Map.Hashmap.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapdemo {
    public static void main(String[] args) {
        Map<Integer, String> weakHashMap = new WeakHashMap<>();
        Integer key1 = 1000;
        Integer key2 = 2000;

        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key2, "Value2");


        System.out.println("Before GC: " + weakHashMap);
        key1 = null;

        System.gc();


        try {
            Thread.sleep(1000); // Sleep for a while to let GC do its work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After GC: " + weakHashMap);
    }
}
