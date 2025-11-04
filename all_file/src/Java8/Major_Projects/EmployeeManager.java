package Java8.Major_Projects;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManager {
    private Map<Integer,Employee> employeeData;

    //constructor
     public EmployeeManager() {
         this.employeeData = new HashMap<>();
     }

    //adding employee to the map and this is a method
    public void addEmployee(Employee employee){
         employeeData.put(employee.getId(), employee);
    }

    //getting employees by their id which returns and employee using optional
    public Optional<Employee> getEmployeesById(int id){
         return Optional.ofNullable(employeeData.get(id));
    }

    //getting all employees
    public List<Employee> getAllEmployee(){
         return new ArrayList<>(employeeData.values());
    }

    //filter employees by salary
    public List<Employee> filterEmployeesBySalary(Double minSalary) {
         return employeeData.values().stream()
                 .filter(x -> x.getSalary().orElse(0.0) >= minSalary)
                 .collect(Collectors.toList());
    }

    //sort the employees by their salary
    public List<Employee> SortEmployeesBySalary() {
         return employeeData.values().stream()
                 .sorted(Comparator.comparingDouble(x -> x.getSalary().orElse(0.0)))
                 .collect(Collectors.toList());
    }
}
