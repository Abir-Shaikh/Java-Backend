package Java8.Mini_Projects;

import java.util.List;
import java.util.stream.Collectors;

public class Project3__EmployeeSalaryProcessing {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Abir" , "Backend" , 140000),
                new Employee("Riya", "Frontend", 125000),
                new Employee("Aman", "DevOps", 135000),
                new Employee("Neha", "QA", 110000),
                new Employee("Sahil", "Backend", 145000),
                new Employee("Kiran", "Data Science", 160000),
                new Employee("Rohit", "Mobile", 130000),
                new Employee("Sneha", "UI/UX", 120000),
                new Employee("Tara", "Cybersecurity", 155000),
                new Employee("Vikram", "Full Stack", 150000),
                new Employee("Isha", "Machine Learning", 170000),
                new Employee("Deepak", "Cloud", 155000),
                new Employee("Aditi", "Frontend", 115000),
                new Employee("Manav", "DevOps", 140000),
                new Employee("Simran", "QA", 108000),
                new Employee("Arjun", "Backend", 138000),
                new Employee("Meera", "Data Analytics", 145000),
                new Employee("Ravi", "Mobile", 125000),
                new Employee("Pooja", "Cloud", 150000),
                new Employee("Kunal", "Full Stack", 160000)
        );

        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.averagingDouble(Employee::getSalary))));


    }
}

class Employee{
    public String nameofEmployee;
    public String department;
    public double salary;

    //getter and setter
    public String getNameofEmployee() {
        return nameofEmployee;
    }
    public void setNameofEmployee(String nameofEmployee) {
        this.nameofEmployee = nameofEmployee;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //constructors
    public Employee(String nameofEmployee, String department, int salary) {
        this.nameofEmployee = nameofEmployee;
        this.department = department;
        this.salary = salary;


    }
}