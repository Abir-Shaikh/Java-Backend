package Collection_frameworks.Comparable;

public class person implements Comparable<person>{
    private String name;
    private double marks;

    public person(String name,double marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int compareTo(person p){
        return Double.compare(p.getMarks(), this.getMarks());
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
