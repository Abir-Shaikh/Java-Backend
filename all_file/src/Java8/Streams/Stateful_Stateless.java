package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stateful_Stateless {
    public static void main(String[] args) {

        //lazy Evaluation
        List<String> names = Arrays.asList("Abir" , "Aarav" , "Bob" , "David");

        Stream<String> stream = names.stream().
                filter(name ->{
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        System.out.println("Before Terminal Operation");

        List<String> result = stream.collect(Collectors.toList());
        System.out.println("After Terminal Operation");
        System.out.println(result);
    }
}
