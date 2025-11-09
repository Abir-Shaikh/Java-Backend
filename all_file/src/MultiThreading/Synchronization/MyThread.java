package MultiThreading.Synchronization;

public class MyThread extends Thread{
    private Counter_Synchronization counter;

    public MyThread(Counter_Synchronization counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            counter.increment();
        }
    }
}
