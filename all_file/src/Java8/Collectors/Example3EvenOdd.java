package Java8.Collectors;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//partitioning even odd
public class Example3EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,12);
        System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
    }
}
