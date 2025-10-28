package Collection_frameworks.Map.Hashmap.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityhashmapexample {
    public static void main(String[] args) {
        String k1 = new String("key");
        String k2 = new String("key");

        Map<String,Integer> map = new IdentityHashMap<>();
        map.put(k1,1);
        map.put(k2,3);

        System.out.println(k1.equals(k2));
        System.out.println(map);


        System.out.println("We are seeing hashcode for identityhashmap :"+ System.identityHashCode(k1));
        System.out.println("We are seeing hashcode for identityhashmap :"+ System.identityHashCode(k2));

        System.out.println("We are seeing hashcode for hashmap :"+k1.hashCode());
        System.out.println("We are seeing hashcode for hashmap :"+k2.hashCode());
    }
}
