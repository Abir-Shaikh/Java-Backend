package Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Example8MethodReference {
    public static void main(String[] args) {

        //use method without invoking and inplace of lambda expressions.
        List<String> list = Arrays.asList("Avik", "Priya", "Aishwariya");
        list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);
        //what is this double coln it is method reference we can invoke methods without calling them

    }
}
