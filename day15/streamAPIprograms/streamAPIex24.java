package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

public class streamAPIex24 {

    public static void main(String[] args) {

        class Employee {
            String name;
            String department;
            double salary;

            Employee( String name , String department , double salary){
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
                new Employee("Vishnu", "HR", 50000));

                List<Employee> result = employees.stream()
                .filter(n -> n.salary > 50000)
                .toList();

               result.forEach( n -> System.out.println(n.name));

               

    }
}
