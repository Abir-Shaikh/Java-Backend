package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationExample {
    public static void main(String[] args) {

        //Taking out the result from streams
        List<Integer> opn = Arrays.asList(1,2,4,5,3,7);

        //1.collect
        System.out.println(opn.stream().skip(1).toList());
        opn.stream().skip(1).collect(Collectors.toList());

        //2. for-each
        opn.stream().forEach(x -> System.out.println(x));

        //3. reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = opn.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        //4. anyMatch() , allMatch() , noneMatch()

        boolean b = opn.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = opn.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = opn.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //5. findFirst , findAny
        System.out.println(opn.stream().findFirst().get());
        System.out.println(opn.stream().findAny().get());

    }

}
