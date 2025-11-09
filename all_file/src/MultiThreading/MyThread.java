package MultiThreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");//after runnable it will be executed
        try {
            Thread.sleep(2000);//Timed Waiting for 2 seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();//new thread created
        System.out.println(t1.getState());//Thread.CurrentThread.getState will imply here so it will print runnable
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(1000);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
