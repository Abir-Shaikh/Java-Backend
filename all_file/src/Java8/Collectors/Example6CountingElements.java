package Java8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6CountingElements {
    public static void main(String[] args) {

        //if we have multiple elements with the same name how we find it.
        List<String> names = Arrays.asList("Aarav", "Charan", "Devika", "Brijesh", "Aarya",
                "Devansh", "Brinda", "Aarav", "Chaitanya", "Devika",
                "Aarya", "Brijesh", "Charvi", "Devansh", "Brinda",
                "Chaitanya", "Aarav", "Charan", "Brijesh", "Devika");

        System.out.println(names.stream().collect(Collectors.toMap(k -> k , v -> 1 , (x , y) -> x+y )));
    }
}
