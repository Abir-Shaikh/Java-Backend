package MultiThreading.Synchronization;

public class Counter_Synchronization {
    private int count = 0;


    //if we dont wanna synchronized the whole method (public synchronized void increment()) then we can write it for the particular instance
    //in this case we will do it for count
    public void increment() {
        synchronized (this){
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}
