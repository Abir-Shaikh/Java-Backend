package Collection_frameworks.Comparator;

//we will learn more about java8 to easily use comparator dont have to write lines of lines of code

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//string
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();
    }
}

//list or integer
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;//if o1 is 5 and o2 is 3 then sort will be  3 and 5
    }
}

//custom comparator
class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}





public class comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);

        //sorted list
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);




        List<Student> students = new ArrayList<>();
        students.add(new Student("Abir", 8.0));
        students.add(new Student("Ayish", 9.2));
        students.add(new Student("priyanshu", 7.1));
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            }else {
                return 0;
            }
        });

        for (Student s : students){
            System.out.println(s.getName()+ ":" + s.getGpa());
        }

    }
}
