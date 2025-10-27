package Collection_frameworks.Map.Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Fruit {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> fruit = new LinkedHashMap<>();
        HashMap<String,Integer> fruit1 = new HashMap<>();
        fruit.put("Apple", 100);
        fruit.put("Banana", 10);
        fruit.put("Litchi", 90);
        fruit.put("Watermelon", 50);
        fruit.put("Orange", 40);
        fruit.put("Grape", 60);
        fruit.put("Strawberry", 20);
        fruit.put("berries", 80);
        System.out.println(fruit);
        fruit1.put("Apple", 100);
        fruit1.put("Banana", 10);
        fruit1.put("Litchi", 90);
        fruit1.put("Watermelon", 50);
        fruit1.put("Orange", 40);
        fruit1.put("Grape", 60);
        fruit1.put("Strawberry", 20);
        fruit1.put("berries", 80);
        System.out.println(fruit1);
    }
}
