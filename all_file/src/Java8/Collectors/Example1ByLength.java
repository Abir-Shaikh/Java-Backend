package Java8.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Collecting names by length
public class Example1ByLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abir" , "Vipul" , "Himong" , "Mainak" , "Riya");
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));
    }
}
