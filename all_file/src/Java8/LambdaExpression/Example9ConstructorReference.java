package Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A" ,"B" ,"C");

        //refering its constructor
        List<Mobile> collect = names.stream().map(Mobile::new).collect(Collectors.toList());

    }
}

class Mobile{
    String name;

    public Mobile(String name) {
        this.name = name;
    }
}
