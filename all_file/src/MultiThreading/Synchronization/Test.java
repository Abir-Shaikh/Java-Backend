package MultiThreading.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter_Synchronization counter = new Counter_Synchronization();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
