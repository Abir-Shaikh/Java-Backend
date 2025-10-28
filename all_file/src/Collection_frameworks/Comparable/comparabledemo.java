package Collection_frameworks.Comparable;

import java.util.ArrayList;
import java.util.List;

public class comparabledemo {
    public static void main(String[] args) {
        List<person> list= new ArrayList<>();
        list.add(new person("Charlie", 3.5));
        list.add(new person("Bob", 3.7));
        list.add(new person("Alice", 3.5));
        list.add(new person("Akshit", 3.9));
        list.sort(null);
        System.out.println(list)    ;
    }
}
