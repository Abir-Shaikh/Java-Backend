package Java8.Major_Projects;

import java.util.Optional;

public class EmployeeProcessor extends Thread{
    private EmployeeManager employeeManager;
    private int employeeID;

    public EmployeeProcessor(EmployeeManager employeeManager , int employeeID){

        //Saves the employeeManager and employeeId into the instance so run() can use them later.
        this.employeeManager = employeeManager;
        this.employeeID = employeeID;
    }

    @Override
    public void run() {
        try {
            Optional<Employee> employeesById = employeeManager.getEmployeesById(employeeID);
            //using lambda expression
            employeesById.ifPresentOrElse(e -> System.out.println("Processing employee : " + e),
                    () -> System.out.println("Employee with Id " + employeeID + " not found")
            );
        } catch (Exception e) {
            System.out.println("Error Processing employee data " + e.getMessage());
        }
    }
}


