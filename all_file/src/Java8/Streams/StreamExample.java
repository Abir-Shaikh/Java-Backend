package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //stream is a feature in java 8 where we can process collections of data in a functional and declarative manner
        //It simplifies the data processing i.e. we don't have to write big codes
        //It also embrace functional programming
        //Improves readability and Maintainability.
        //without dealing with multithreading complexities we can Enable easy parallelism.

        /* How to use Streams?
        A sequence of elements supporting functional and declarative programming.

        when we are using streams there will be some source like list or smth like that and do operation on it
        like Intermediate Operation and Terminal Operation.
        * */

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //ok lets find the numbers divisible by 2
        //normal method
        int count = 0;
        for (int i : list){
            if (i % 2 == 0 ) {
                count++;
            }
        }
        System.out.println("The Number divisible by 2 are : " + count);


        //stream method
        System.out.println(list.stream().filter(x -> x%2 == 0).count());

        //creating streams
        // 1. from collection
        List<Integer> list1 = new ArrayList<>();
        Stream<Integer> stream = list1.stream();

        //2. From Arrays
        String[] arr = {"a" , "b" , "c"};
        Stream<String> stream1 = Arrays.stream(arr);

        //3. Using Stream.of()
        Stream<String> values = Stream.of("a", "b");

        //4. Infinite Streams -> we set the limit as it giving a exception called OutofMemory Exception
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);//we can declare the size using limit
        List<Integer> collect = Stream.iterate(0, x -> x + 1).collect(Collectors.toList());
        System.out.println(collect);


    }
}
