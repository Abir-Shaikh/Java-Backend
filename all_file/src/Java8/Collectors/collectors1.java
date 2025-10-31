package Java8.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class collectors1 {
    public static void main(String[] args) {

        //they are a utility class which provides a set of methods to create common collectors.

        //1. collecting to a list
        List<String> name = Arrays.asList("Abir" , "Bob" , "Rob");
        List<String> res = name.stream()
                .filter(names -> names.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        //2. collecting to a set
        List<Integer> num = Arrays.asList(1,2,3,4,6,7,8,9);
        Set<Integer> set = num.stream().collect(Collectors.toSet());
        System.out.println(set);

        //3. collecting to a specified collection
        ArrayDeque<String> collect = name.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        //4. joining strings
        //concatenates stream elements into a single string
        String collect1 = name.stream().map(String::toUpperCase).collect(Collectors.joining(" ,"));
        System.out.println(collect1);

        //5. Summarizing data
        //generate statistical summary (count , sum , min , average , max)
        List<Integer> num1 = Arrays.asList(1,2,3,4,6,7,8,9);
        IntSummaryStatistics stats = num1.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());

        //6. calculating Averages
        Double average = num1.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(average);

        //7.Grouping Elements
        List<String> words = Arrays.asList("hello" , "world" , "java" , "streams" , "collect");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length , Collectors.joining(","))));

        //8. partitioning elements
        //partitions into two groups (true or false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        //9.Mapping and Collecting
        //Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase() , Collectors.toList())));
    }
}
