package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamAPIex24 {

    public static void main(String[] args) {

        class Employee {

            String name;
            String department;
            double salary;

            Employee(String name, String department, double salary) {
                this.name = name;
                this.department = department;
                this.salary = salary;
            }
        }

        List<Employee> employees = Arrays.asList(
                new Employee("Arun", "IT", 60000),
                new Employee("Rahul", "HR", 45000),
                new Employee("Meera", "IT", 75000),
                new Employee("Anu", "Finance", 55000),
                new Employee("Vishnu", "HR", 50000)
        );

        // 1. Employees with salary greater than 50,000
        List<Employee> result = employees.stream()
                .filter(e -> e.salary > 50000)
                .toList();

        System.out.println("Employees with salary > 50000:");

        result.forEach(e -> System.out.println(e.name));


        // 2. Employee with the highest salary
        Optional<Employee> highestSalary = employees.stream()
                .max((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nHighest salary:");

        highestSalary.ifPresent(e ->
                System.out.println(e.name + " -> " + e.salary)
        );


        // 3. Average salary
        double averageSalary = employees.stream()
                .mapToDouble(e -> e.salary)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage salary: " + averageSalary);


        // 4. Group employees by department
        Map<String, List<Employee>> departmentGroups = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        System.out.println("\nEmployees grouped by department:");

        departmentGroups.forEach((department, employeeList) -> {
            System.out.print(department + " -> ");

            employeeList.forEach(e ->
                    System.out.print(e.name + " ")
            );

            System.out.println();
        });


        // 5. Highest-paid employee
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nHighest-paid employee:");

        highestPaidEmployee.ifPresent(e ->
                System.out.println(e.name)
        );
    }
}