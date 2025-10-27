package Collection_frameworks.Map.Hashmap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHAshMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> linkedHashMap = new LinkedHashMap<>(12,0.2f,true);//doubly linked list
        linkedHashMap.put("Orange", 1);
        linkedHashMap.put("Mango", 4);
        linkedHashMap.put("Banana", 6);
        linkedHashMap.get("Mango");
        System.out.println(linkedHashMap);

        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<>();

        hashMap.put("Abir", 91);
        hashMap.put("Rayan", 60);
        hashMap.put("Vipul", 78);

        Integer result = hashMap.getOrDefault("Vipul",0);
        //if we use putIfAbsent method either it will get updated or it will get added in the list.
        hashMap.putIfAbsent("Shubham",92);//to handle edge cases
        System.out.println(hashMap);
        System.out.println(result);
    }
}
