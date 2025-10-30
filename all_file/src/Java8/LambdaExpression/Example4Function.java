package Java8.LambdaExpression;

import java.util.function.Function;

public class Example4Function {
    public static void main(String[] args) {

        //function --> work for u not like predicate
        Function<Integer , Integer> twice = x-> 2 * x;
        Function<Integer , Integer> triple = x->3 * x;
        System.out.println(twice.andThen(triple).apply(100));//same answer
        System.out.println(twice.compose(triple).apply(100));//same answer
        System.out.println(twice.apply(100));

        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(67);
        System.out.println(res);

    }
}
