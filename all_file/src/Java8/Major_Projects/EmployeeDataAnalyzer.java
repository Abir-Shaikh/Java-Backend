package Java8.Major_Projects;

import java.util.List;

public class EmployeeDataAnalyzer {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();


        //adding employees
        employeeManager.addEmployee(new Employee(1 , "Rayan" , "Engineering" , 75000.0));
        employeeManager.addEmployee(new Employee(2 , "Aisha" , "HR" , 58000.0));
        employeeManager.addEmployee(new Employee(3 , "Kabir" , "Finance" , 64000.0));
        employeeManager.addEmployee(new Employee(4 , "Ishita" , "Marketing" , 71000.0));
        employeeManager.addEmployee(new Employee(5 , "Dev" , "Engineering" , 82000.0));
        employeeManager.addEmployee(new Employee(6 , "Rohit" , "Sales" , 55000.0));
        employeeManager.addEmployee(new Employee(7 , "Meera" , "Design" , 60000.0));
        employeeManager.addEmployee(new Employee(8 , "Tanya" , "Support" , 48000.0));
        employeeManager.addEmployee(new Employee(9 , "Aditya" , "Engineering" , 95000.0));
        employeeManager.addEmployee(new Employee(10 , "Sara" , "HR" , 53000.0));
        employeeManager.addEmployee(new Employee(11 , "Vikram" , "Finance" , 67000.0));
        employeeManager.addEmployee(new Employee(12 , "Neha" , "Engineering" , 88000.0));
        employeeManager.addEmployee(new Employee(13 , "Arjun" , "Marketing" , 72000.0));
        employeeManager.addEmployee(new Employee(14 , "Krisha" , "Support" , 46000.0));
        employeeManager.addEmployee(new Employee(15 , "Manav" , "Sales" , 57000.0));
        employeeManager.addEmployee(new Employee(16 , "Rehan" , "Engineering" , 91000.0));
        employeeManager.addEmployee(new Employee(17 , "Priya" , "Finance" , 69000.0));
        employeeManager.addEmployee(new Employee(18 , "Ananya" , "Design" , 63000.0));
        employeeManager.addEmployee(new Employee(19 , "Ravi" , "Marketing" , 75000.0));
        employeeManager.addEmployee(new Employee(20 , "Sneha" , "Support" , 50000.0));
        employeeManager.addEmployee(new Employee(21 , "Zara" , "Engineering" , 98000.0));
        employeeManager.addEmployee(new Employee(22 , "Kabya" , "HR" , 60000.0));
        employeeManager.addEmployee(new Employee(23 , "Om" , "Finance" , 64000.0));
        employeeManager.addEmployee(new Employee(24 , "Harsh" , "Engineering" , 87000.0));
        employeeManager.addEmployee(new Employee(25 , "Ira" , "Design" , 58000.0));
        employeeManager.addEmployee(new Employee(26 , "Nikhil" , "Marketing" , 70000.0));
        employeeManager.addEmployee(new Employee(27 , "Aarav" , "Engineering" , 89000.0));
        employeeManager.addEmployee(new Employee(28 , "Divya" , "Sales" , 56000.0));
        employeeManager.addEmployee(new Employee(29 , "Karan" , "Support" , 49000.0));
        employeeManager.addEmployee(new Employee(30 , "Leena" , "HR" , 61000.0));
        employeeManager.addEmployee(new Employee(31 , "Ritesh" , "Finance" , 65000.0));
        employeeManager.addEmployee(new Employee(32 , "Tara" , "Marketing" , 73000.0));
        employeeManager.addEmployee(new Employee(33 , "Shaan" , "Engineering" , 94000.0));
        employeeManager.addEmployee(new Employee(34 , "Maya" , "Design" , 62000.0));
        employeeManager.addEmployee(new Employee(35 , "Eshan" , "Engineering" , 90000.0));
        employeeManager.addEmployee(new Employee(36 , "Naina" , "Support" , 51000.0));
        employeeManager.addEmployee(new Employee(37 , "Kavya" , "Sales" , 59000.0));
        employeeManager.addEmployee(new Employee(38 , "Rohini" , "Engineering" , 81000.0));
        employeeManager.addEmployee(new Employee(39 , "Tanmay" , "Finance" , 67000.0));
        employeeManager.addEmployee(new Employee(40 , "Aditi" , "Design" , 60500.0));
        employeeManager.addEmployee(new Employee(41 , "Yash" , "Engineering" , 96000.0));
        employeeManager.addEmployee(new Employee(42 , "Sia" , "Marketing" , 74000.0));
        employeeManager.addEmployee(new Employee(43 , "Farhan" , "HR" , 58000.0));
        employeeManager.addEmployee(new Employee(44 , "Rupal" , "Finance" , 68000.0));
        employeeManager.addEmployee(new Employee(45 , "Ajay" , "Engineering" , 83000.0));
        employeeManager.addEmployee(new Employee(46 , "Ishaan" , "Sales" , 55000.0));
        employeeManager.addEmployee(new Employee(47 , "Diya" , "Support" , 48000.0));
        employeeManager.addEmployee(new Employee(48 , "Ritika" , "Design" , 60000.0));
        employeeManager.addEmployee(new Employee(49 , "Varun" , "Engineering" , 88000.0));
        employeeManager.addEmployee(new Employee(50 , "Shreya" , "Marketing" , 72000.0));


        //simulating multithreading  : Process employees by id

        Thread process1 = new EmployeeProcessor(employeeManager , 1);
        Thread process2 = new EmployeeProcessor(employeeManager , 5);
        Thread process3 = new EmployeeProcessor(employeeManager , 12);
        Thread process4 = new EmployeeProcessor(employeeManager , 20);
        Thread process5 = new EmployeeProcessor(employeeManager , 27);
        Thread process6 = new EmployeeProcessor(employeeManager , 33);
        Thread process7 = new EmployeeProcessor(employeeManager , 41);
        Thread process8 = new EmployeeProcessor(employeeManager , 49);
        Thread process9 = new EmployeeProcessor(employeeManager , 55);  // non-existing
        Thread process10 = new EmployeeProcessor(employeeManager , 60); // non-existing

        process1.start();
        process2.start();
        process3.start();
        process4.start();
        process5.start();
        process6.start();
        process7.start();
        process8.start();
        process9.start();
        process10.start();


        //using join() to ensure all the main thread wait for processors to finish
        try {
            process1.join();
            process2.join();
            process3.join();
            process4.join();
            process5.join();
            process6.join();
            process7.join();
            process8.join();
            process9.join();
            process10.join();
        } catch (Exception e) {
            System.out.println("Error waiting for thread exception " + e.getMessage());
        }

        //filter and prints employees with salary >= 70000
        System.out.println("\nEmployees with salary >= 70000 : ");
        List<Employee> HighPayers = employeeManager.filterEmployeesBySalary(70000.0);
        HighPayers.forEach(System.out::println);


        //sorts all and prints employees by salary
        System.out.println("\nEmployees salary after sorted : ");
        List<Employee> sortedAfter = employeeManager.SortEmployeesBySalary();
        sortedAfter.forEach(System.out::println);

    }
}
