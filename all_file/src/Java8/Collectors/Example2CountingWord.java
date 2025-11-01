package Java8.Collectors;

import java.util.Arrays;
import java.util.stream.Collectors;

//counting word occurences
public class Example2CountingWord {
    public static void main(String[] args) {
        String CountWords = "Hello minna daijobu minasan konbanwa minasan";
        System.out.println(Arrays.stream(CountWords.split(" ")).
                collect(Collectors.groupingBy(x ->x , Collectors.counting())));
    }
}
