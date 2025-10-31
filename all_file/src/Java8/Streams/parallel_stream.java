package Java8.Streams;

import java.util.List;
import java.util.stream.Stream;

public class parallel_stream {
    public static void main(String[] args) {
        //A type of stream that enables parallel processing of elements
        //Allowing multiple threads to process parts of the stream simultaneously
        //This can be significantly improve performance for large data sets
        //Here Workloads are distributed across multiple threads

        long starttime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1 , x->x+1).limit(50000).toList();
        List<Long> factoriallist = list.stream().map(parallel_stream::factorial).toList();
        long endtime = System.currentTimeMillis();
        System.out.println("Time taken sequential stream :" + (endtime-starttime) + "ms");
        //System.out.println(factoriallist);


        starttime = System.currentTimeMillis();
        //List<Integer> list = Stream.iterate(1 , x->x+1).limit(200000).toList();
        factoriallist = list.parallelStream().map(parallel_stream::factorial).toList();
        endtime = System.currentTimeMillis();
        System.out.println("Time taken by parallel stream :" + (endtime-starttime) + "ms");


        //when to use parallelStream
        //they are most-effective for CPU-intensive or large datasets where tasks are independent
        //They may add overhead for simple tasks or small datasets.


    }
    private static long factorial(int n) {
        long resuly = 1;
        for (int i = 2; i < n; i++) {
            resuly *= i;
        }
        return resuly;
    }
}
