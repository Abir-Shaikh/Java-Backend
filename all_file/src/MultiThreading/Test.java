package MultiThreading;

public class Test {
    public static void main(String[] args) {
        World world = new World();
        Thread a =new Thread(world);
        a.start();
        for (; ;) {
            System.out.println("Hello");
        }
    }
}