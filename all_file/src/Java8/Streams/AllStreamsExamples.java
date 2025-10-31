package Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class AllStreamsExamples {
    public static void main(String[] args) {

        //1. find the names of the person whose length are less than 3
        List<String> names = Arrays.asList("Aarav","Vihaan","Reyansh","Aditya","Arjun","Dev","Krishna","Ishan","Rohan","Advait","Saanvi","Anaya","Diya","Myra","Aarohi","Kiara","Ira","Navya","Tara","Meera","Harsh","Abir","Ritika","Nisha","Rehan","Samir","Arnav","Rudra","Ayaan","Ved","Om","Prisha","Avni","Kavya","Sara","Ishita","Anvi","Manya","Pari","Aanya","Trisha","Rhea","Simran","Tanish","Ritik","Ashwin","Neha","Manav","Akira","Ayush");
        System.out.println(names.stream().filter(x -> x.length() < 4).toList());

        //2. Squaring and sorted Numbers
        List<Integer> list = Arrays.asList(5,6,8,2,9,1);
        System.out.println(list.stream().map(x-> x* x).sorted().toList());

        //3.summing values
        List<Integer> integers = Arrays.asList(1,3,4,5,7,9);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        //4.Counting occurence of a character
        String words = "Hula Bula Ghula";
        System.out.println(words.chars().filter(x-> x == 'l').count());
    }
}
