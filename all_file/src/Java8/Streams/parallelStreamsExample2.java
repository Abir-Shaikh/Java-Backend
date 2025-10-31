package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class parallelStreamsExample2 {
    public static void main(String[] args) {
        //finding cumulative sum
        //[1,2,3,4,5] --> [1,3,6,10,15]
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> list1 = number.parallelStream().map(sum::addAndGet).toList();
        List<Integer> list = number.stream().map(sum::addAndGet).toList();
        System.out.println("Expected cumulative sum :  [1,3,6,10,15] ");
        System.out.println("actual result with stream : " + list);
        System.out.println("actual result with parallel stream : " + list1);
    }
}
