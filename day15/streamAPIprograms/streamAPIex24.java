package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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


               
               Optional<Employee> result2 = employees.stream()
               .max((n1 , n2) -> Double.compare(n1.salary, n2.salary));

               System.out.println("highest salary is : "+result2.get().salary+ "."+"\nEmployee with highest salary : "+result2.get().name);

               

    }
}
