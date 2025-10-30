package Java8.LambdaExpression;

import java.util.function.Supplier;

public class Example6Supplier {
    public static void main(String[] args) {

        //why use this?
        //it will only give values like if u want something from the database and want it 100 times
        //so u can ask the Supplier method yo give you and all set
        Supplier<String> gimme = () -> "Hello Love";
        System.out.println(gimme.get());
    }
}
