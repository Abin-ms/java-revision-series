package day7;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("SQL");
        books.push("Spring Boot");
        books.push("Learn Spring Boot");
        books.push("Revise Collections");

        System.out.println(books);
        System.out.println( books.peek());

        System.out.println("Removing the element at the top : "+books.pop());
        
    }
}
