package Java8.LambdaExpression;

import java.util.function.Predicate;

public class Example3predicate {
    public static void main(String[] args) {
        //predicate --> Functional Interface( Boolean Valued Function)
        //what does prediacte do? it just hold a condition
        //do u know how powerful is it u are storing a condition in a variable
        Predicate<Integer> isOdd = x -> x % 1 == 0;
        System.out.println(isOdd.test(5));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        Predicate<String> isWordsCheck = x -> x.startsWith("A");
        System.out.println(isWordsCheck.test("Abir"));
    }
}
