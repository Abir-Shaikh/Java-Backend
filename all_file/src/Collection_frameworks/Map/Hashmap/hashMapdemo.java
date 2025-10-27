package Collection_frameworks.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapdemo {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>(17,0.5f);
        students.put(1, "Abir");
        students.put(2, "Ayish");
        students.put(3, "Himong");
        students.put(4, "Rayan");

        System.out.println(students);
        String a = students.get(3);
        System.out.println(a);
        String b = students.get(69);//checking if the number is there in table?
        System.out.println(b);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Himong"));

        for (int i : students.keySet()){
            System.out.println(students.get(i));
        }


        //sir this is how we can iterate over each item in hashmap using set.
        Set<Map.Entry<Integer, String>> entries = students.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toLowerCase());
        }
        System.out.println(students);

        students.remove(3);
        System.out.println(students);

        System.out.println(students.hashCode());
    }
}
