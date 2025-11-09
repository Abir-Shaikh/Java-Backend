package MultiThreading;

public class Thread_Methods1 extends Thread{


    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Thread_Methods1 t1 = new Thread_Methods1();
        Thread_Methods1 t2 = new Thread_Methods1();
        t1.start ();
        t2.start();
    }
}



//yield() --> hint to the schedular that other thread can be given a chance to run