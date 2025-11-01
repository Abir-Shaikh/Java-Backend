package Java8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//creating map from stream elements
public class Example5StreamElements {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple" , "guava" , "lemon");
        System.out.println(fruits.stream().collect(Collectors.toMap(x->x.toUpperCase() , x-> x.length())));


    }
}
