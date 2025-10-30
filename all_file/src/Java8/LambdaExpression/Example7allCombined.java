package Java8.LambdaExpression;

import java.util.function.*;

public class Example7allCombined {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x ->System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //As we see they only take one argumnet so how will store multiple arguments or 2 arguments
        //so , we use BiPredicate, BiFunction , BiConsumer

        BiPredicate<Integer,Integer> isumEven = (x,y) -> (x + y) % 2 == 0;
        System.out.println(isumEven.test(2,4));

        //similarly we will use BiConsumer

        BiFunction<String,String,Integer> biFunction = (x,y)-> (x+y).length();
        System.out.println(biFunction.apply("a","bc"));


        //for finding function we can also use UnaryOperator which implements Function so we dont have to write Integer 2 times
        UnaryOperator<Integer> a = x -> 2;

        //like that binary operator implements bifunction

        BinaryOperator<Integer> b = (x,y) ->(x + y ) ^ 2;
        System.out.println(b.apply(2,5));
    }
}
