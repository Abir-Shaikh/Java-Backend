package MultiThreading;

public class ThreadMethodset_daemon extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("Hello World !");//user thread
        }
    }

    public static void main(String[] args) {
        ThreadMethodset_daemon t1 = new ThreadMethodset_daemon(); //user thread
        t1.setDaemon(true);
        t1.start();
        System.out.println("Maro goli!!");
    }
}


//daemon thread() --> Marks the thread as either a daemon thread or a user thread. When the JVM exits, all daemon threads are terminated.