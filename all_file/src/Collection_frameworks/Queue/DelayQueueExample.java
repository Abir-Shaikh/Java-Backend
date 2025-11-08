package Collection_frameworks.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {
    public static void main(String[] args) throws InterruptedException {
        //Thread safe unbounded blocking queue
        //Elements can only be taken from the queue when their delay has expired
        //Useful for scheduling tasks to be executed after a certain delay
        //internally priority queue is used only

        BlockingQueue<DelayedClass> queue = new DelayQueue<>();
        queue.put(new DelayedClass("Task1", 5, TimeUnit.SECONDS));
        queue.put(new DelayedClass("Task2", 3, TimeUnit.SECONDS));
        queue.put(new DelayedClass("Task3", 10, TimeUnit.SECONDS));

        while (!queue.isEmpty()) {
            DelayedClass task = queue.take(); // Blocks until a task's delay has expired
            System.out.println("Executed: " + task.getTaskname() + " at " + System.currentTimeMillis());
        }

    }


}

class DelayedClass implements Delayed{

    private final String taskname;
    private final long starttime;

    public DelayedClass(String taskname, long delay , TimeUnit unit) {
        this.taskname = taskname;
        this.starttime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = starttime - System.currentTimeMillis();
        return unit.convert(remaining , TimeUnit.MILLISECONDS);
    }

    public String getTaskname() {
        return taskname;
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.starttime < ((DelayedClass)o).starttime){
            return -1;
        }
        if (this.starttime > ((DelayedClass)o).starttime) {
            return 1;
        }
        return 0;


    }
}
