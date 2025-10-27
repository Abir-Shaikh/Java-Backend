package Collection_frameworks.Map.Hashmap.TreeMap;

import java.util.TreeMap;

public class TreemapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("Orange", 1);
        treeMap.put("Guava", 4);
        treeMap.put("Grapes", 10);
        treeMap.put("Mango", 3);
        System.out.println(treeMap);
    }
}
