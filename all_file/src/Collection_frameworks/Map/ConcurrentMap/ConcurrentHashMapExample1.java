package Collection_frameworks.Map.ConcurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
    public static void main(String[] args) {

        //in java 7 --> segement based locking like divided into --> 16 segments(initial capacity)  --> smaller hashmaps
        //only the segment being written to or read from is locked
        //so if we talk about read operation
        //read : do not require locking unless there is a write operation happening on the same segment.
        //write : so when the writing operation is happening then and there it will lock the segment

        //java8 --> no segmentation because there are only 16 segments so when the program runs we cannot scale them.
        //so what they will use --> Compare-And-Swap Approach --> no locking except resizing or collision happened so lock will happen
        // Thread z Last saw -->  a = 32
        //change it to 40
        // Thread z work --> a to 40
        //if a is still 42, then change it to 40 else don't change and retry.


        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("Abir" , 44);
        concurrentHashMap.put("Ash" , 28);
        concurrentHashMap.put("rigor" , 32);

        System.out.println("Map size : " + concurrentHashMap.size());
        System.out.println(concurrentHashMap.getOrDefault("Ayish", null));

        concurrentHashMap.remove("Ash");
        System.out.println("After remove : "+ concurrentHashMap);
    }
}
