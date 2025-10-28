package Collection_frameworks.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

//internal implementation is red black tree which is a self balancing binary search tree

public class sortedmapexample {
    public static void main(String[] args) {
        SortedMap<Integer,String> sortedMap = new TreeMap<>((a,b) -> b - a);
        sortedMap.put(13,"Harsh");
        sortedMap.put(29,"Vivek");
        sortedMap.put(15,"Gujju");
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(15));
        System.out.println(sortedMap.tailMap(15));
    }

}
