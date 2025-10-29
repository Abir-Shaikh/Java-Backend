package Collection_frameworks.Map.Hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class threadsafeExample {
    public static void main(String[] args) {

        //we use hashtable because it is thread safe where as in hashmap it is not threadsafe and often missout some values
        Hashtable<Integer,String> hashMap = new Hashtable<>();
        //HashMap<Integer,String> hashMap = new HashMap<>();


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                hashMap.put(i,"Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10000; i < 20000; i++) {
                hashMap.put(i,"Thread2");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Final size of HashMap: " + hashMap.size());
    }
}
