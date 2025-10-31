package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpn {
    public static void main(String[] args) {
        //What are Intermediate Operation?
        /*They transform a stream into another stream
        They are lazy , meaning they dont execute until a terminal operation is invoked.
        * */

        //1. filter
        List<String> list = Arrays.asList("Aarav","Vihaan","Reyansh","Aditya","Arjun","Dev","Krishna","Ishan","Rohan","Advait","Saanvi","Anaya","Diya","Myra","Aarohi","Kiara","Ira","Navya","Tara","Meera","Harsh","Abir","Ritika","Nisha","Rehan","Samir","Arnav","Rudra","Ayaan","Ved","Om","Prisha","Avni","Kavya","Sara","Ishita","Anvi","Manya","Pari","Aanya","Trisha","Rhea","Simran","Tanish","Ritik","Ashwin","Neha","Manav","Akira","Ayush");
        //what does filter do it predicates over the whole array and check if the elements are there or not
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")).limit(10).sorted();
        System.out.println(filteredStream.collect(Collectors.toList()));

        //2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        System.out.println(list);

        //3. Sorted List
        Stream<String> sorted = list.stream().sorted();

        //4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        //5. limit
        System.out.println(Stream.iterate(1, x->x+1).limit(100).count());

        //6. skip
        System.out.println(Stream.iterate(1 , x->x+1).skip(10).limit(100).count());
    }
}
