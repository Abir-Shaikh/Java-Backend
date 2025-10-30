package Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example5Consumer {
    public static void main(String[] args) {

        //what does consumer means
        //That means it will take/Consume something but doesnot return something
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(52);
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 8);
        Consumer<List<Integer>> print = x ->{
            for (int i : x){
                System.out.println(i);
            }
        };
        print.accept(list);
    }
}
