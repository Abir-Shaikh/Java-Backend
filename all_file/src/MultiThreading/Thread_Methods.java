package MultiThreading;

public class Thread_Methods extends Thread {

    public Thread_Methods(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Thread is running.....");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() +
                        " - Priority: " + Thread.currentThread().getPriority() +
                        " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread_Methods l = new Thread_Methods("Low Priority Thread");
        Thread_Methods m = new Thread_Methods("Medium Priority Thread");
        Thread_Methods n = new Thread_Methods("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        n.start();

        Thread_Methods t1 = new Thread_Methods("Join Thread");
        t1.start();
        t1.join();

        System.out.println("Hello Kanglus");
    }
}




//Start() --> Will create a thread and execute run() method.
// Thread.sleep() --> current thread will go to sleep
// t1.join() --> once t1 thread has finished execution then only next thread will resume
// setPriority() --> Changes the priority of the thread. The priority is a value between Thread.MIN_PRIORITY (1) and Thread.MAX_PRIORITY (10).
//interrupt() --> Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException.
