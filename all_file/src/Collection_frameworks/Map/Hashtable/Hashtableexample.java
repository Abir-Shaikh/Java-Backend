package Collection_frameworks.Map.Hashtable;

import java.util.Hashtable;

public class Hashtableexample {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        //hashtable is synchronized i.e it is thread safe
        //so the key and the value cannot be null
        //Its a legacy class because its being replaced by ConcurrentHashMap
        //It is slower than Hashmap because it is synchronized.
        //After a thresold Hashmap use Binary search tree if collision happened .
        //only linked list in case of collision.

        hashtable.put("Abir" , 82);
        hashtable.put("Rayan", 99);
        hashtable.put("Amber" , 13);

        System.out.println(hashtable);
        System.out.println("Value for key 2 : " + hashtable.get("Amber"));


//        hashtable.put("null" , null);//throws exception
//        System.out.println(hashtable);
    }
}
