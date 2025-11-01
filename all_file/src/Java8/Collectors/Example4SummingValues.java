package Java8.Collectors;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Summing all the Values in a map
public class Example4SummingValues {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("Apple" , 13);
        map.put("Banana" , 33);
        map.put("cucumbur" , 21);
        System.out.println(map.values().stream().collect(Collectors.summingInt(x -> x)));
        System.out.println(map.values().stream().reduce(Integer :: sum));
    }
}
