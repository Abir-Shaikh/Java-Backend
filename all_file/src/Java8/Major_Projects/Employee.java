package Java8.Major_Projects;

import java.util.Optional;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    //constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //getters
    public int getId() {
        return id;
    }
    public String getNames() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    //we are using Optional.ofNullable to return the getSalary getter to safely handle null salary values.
    public Optional<Double> getSalary() {
        return Optional.ofNullable(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
