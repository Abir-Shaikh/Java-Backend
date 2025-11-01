package Java8.PrimitiveStreams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {1,3,3,5,7,7,4};
        IntStream stream = Arrays.stream(nums);

        //Stream<Integer> boxed = stream.boxed();
        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));

    }
}
