package Java8.Mini_Projects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Project1__WordFrequencyCounter {
    public static void main(String[] args) {
        String FrequencyCounter = "Hi hello limca beche boror kaka nodi r opor flat niyeche som mongol alta sidhur pore sobai cholo arati te";
        System.out.println(Arrays.stream(FrequencyCounter.split(" ")).collect(Collectors.groupingBy(x->x , Collectors.counting())));
    }
}
