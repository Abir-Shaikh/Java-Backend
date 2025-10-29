package Collection_frameworks.Map.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableExample {
    public static void main(String[] args) {
        //what is immutable map ?
        /*where we cannot instantiate , add , remove , update and so on
        * */

        Map<String, Integer> map = new HashMap<>();
        map.put("Abir" , 1);
        map.put("Raj" , 2);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        System.out.println(map1);
//        map1.put("c" , 3);   //throws exception

        //to avoid this there is another type of methods we will see that is map.of
        // but there is a limitation that it can only store 10 key value pairs so to avoid this thing there is another method
        Map<String, Integer> map2 = Map.of("Shubham", 42, "Raju", 54, "Sayan", 42);
        System.out.println(map2);

        //map.ofEntries is where we can store unlimited kay value pair
        Map<String, Integer> map3 = Map.ofEntries(Map.entry("Shubham", 42) , Map.entry("Raju", 54));
        System.out.println(map3);

    }
}
