package MultiThreading;

/*
we can acheive multithreading by two method
1)by implementing the runnable interface
ki hbe if we are implementing
at 1st amake implement korte hbe runnable class ta then test class a amke tar akta instance variable
banate hbe oi instance variable amr Thread a = new Thread(); bole arekta instance variable
call korbe tarpore a.start(); korle amr run korbe

2)by extending the Thread class
akhane just amke akta instance variable banate hbe test class a and oi variable take
start korar jonne just instancevariable.start ethod use korle ese jbe amr answer.
 */
public class World implements Runnable{
    @Override
    public void run() {
        for ( ; ;) {
            System.out.println("world!!");
        }
    }
}