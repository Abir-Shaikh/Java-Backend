package Collection_frameworks.copyonwritearrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        //"copy on write" means that whenever i will do a write operation
        //like adding or removing an element
        //instead of directly modifying the existing list
        //a new copy of the arraylist is created, and the modification is applied to that copy
        //This ensures that other threads reading the list while it's being modified ort unaffected.

        //Read Operation: Fast and direct, since they happen on a stable list without interference from modifications.
        //Write Operations: A new copy of the list is created for every modification.
        //          The reference to the list is then updated so that subsequent reads use this new list.


        List<String> tocart = new CopyOnWriteArrayList<>();
        tocart.add("milk");
        tocart.add("butter");
        tocart.add("carrots");

        for (String x : tocart){
            System.out.println(x);
            if (x.equals("butter")) {
                tocart.add("Bread");
                System.out.println("Added Bread");
            }
        }

        System.out.println("Updated shopping list "+tocart);



//below this code is nothing but to show how it is thread safe

//        List<String> sharedList = new CopyOnWriteArrayList<>();
//        sharedList.add("Item1");
//        sharedList.add("Item2");
//        sharedList.add("Item3");
//        Thread readerThread = new Thread(() -> {
//            try {
//                while (true) {
//                    // Iterate through the list
//                    for (String item : sharedList) {
//                        System.out.println("Reading item: " + item);
//                        Thread.sleep(100); // Small delay to simulate work
//                    }
//                }
//            } catch (Exception e) {
//                System.out.println("Exception in reader thread: " + e);
//            }
//        });
//        Thread writerThread = new Thread(() -> {
//            try {
//                Thread.sleep(500); // Delay to allow reading to start first
//                sharedList.add("Item4");
//                System.out.println("Added Item4 to the list.");
//
//                Thread.sleep(500);
//                sharedList.remove("Item1");
//                System.out.println("Removed Item1 from the list.");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        readerThread.start();
//        writerThread.start();
    }
}
