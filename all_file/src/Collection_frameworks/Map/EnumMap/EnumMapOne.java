package Collection_frameworks.Map.EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapOne {
    public static void main(String[] args) {
        Map<Name,String > a = new EnumMap<>(Name.class);
        a.put(Name.Aiden , "Testing the login module");
        a.put(Name.Aditya, "Implementing API endpoints");
        System.out.println(a);
        //checking the index
        System.out.println(Name.Aditya.ordinal());


        for (Map.Entry<Name, String> x : a.entrySet()) {
            System.out.println(x.getKey() + ": " + x.getValue());
        }

        //to print all the elements in the array
        System.out.println(java.util.Arrays.asList(Name.values()));
    }
}

enum Name{
    Aiden,Maya,Ethan,Priya,Leo,Zara,Noah,Riya,Aarav,Kiara,Liam,Ananya,Arjun,Sofia,Dev,Meera,Ryan,Isha,Kabir,Alina,Vivaan,Tara,Karan,Nisha,
    Samaira,Rohan,Diya,Aditya,Neha,Aarohi

}