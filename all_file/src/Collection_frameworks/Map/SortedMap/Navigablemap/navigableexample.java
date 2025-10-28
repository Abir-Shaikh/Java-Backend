package Collection_frameworks.Map.SortedMap.Navigablemap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class navigableexample {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap = new TreeMap<>((a, b) -> b - a);
        navigableMap.put(13,"Harsh");
        navigableMap.put(29,"Vivek");
        navigableMap.put(15,"Gujju");
        System.out.println(navigableMap);
        System.out.println(navigableMap.ceilingEntry(13));
        System.out.println(navigableMap.floorKey(20));
    }
}
