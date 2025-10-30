package Java8.LambdaExpression;

public class Example1 {
    public static void main(String[] args) {
        //lambda expression
        //lambda expression is an anonymous function (no name, no parameter, no access modifier)

        Thread a = new Thread(() -> {
            System.out.println("Hello");
        });
        System.out.println(a.isAlive());
        System.out.println(a.getName());
    }
}
