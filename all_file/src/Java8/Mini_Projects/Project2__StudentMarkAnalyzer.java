package Java8.Mini_Projects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Project2__StudentMarkAnalyzer {
    public static void main(String[] args) {
        List<student> students = List.of(
                new student("Abir" , 23),
                new student("Ayish" , 32),
                new student("Gaurav" , 21),
                new student("Rishi" , 61),
                new student("Raj" , 43)
        );
        //Average Marks
        System.out.println("Average Marks : " + students.stream().mapToInt(x -> x.marks).average());

        //Topper
        students.stream().filter(x-> x.marks > 50).forEach(x-> System.out.println("Topper --> " + x.name +" got "+ x.marks));

    }
}
class student {
    public String name;
    public int marks;

    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
