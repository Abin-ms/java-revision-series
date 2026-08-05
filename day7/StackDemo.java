package day7;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Java");
        books.push("Practice SQL");
        books.push("Spring Boot");
        books.push("Learn Spring Boot");
        books.push("Revise Collections");

        System.out.println(books);
        System.out.println(books.peek());

        System.out.println("Removing the element at the top : " + books.pop());

        System.out.println("The updated Stack :\n" + books);

        if (books.empty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }

        System.out.println("The element - Practice SQL -  is at : " + books.search("Practice SQL"));

        while (!books.empty()) {
            System.out.println("Completed: " + books.pop());
        }

        System.out.println("All tasks completed!");

    }
}
