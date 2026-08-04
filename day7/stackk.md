
# Topic 7: Stack

By the end of this lesson, you'll understand:

* What is a Stack?
* LIFO principle
* Internal working
* `push()`
* `pop()`
* `peek()`
* `empty()`
* `search()`
* Real-world applications
* Time complexity
* Interview questions

---

# What is a Stack?

A **Stack** is a linear data structure that follows:

# LIFO

**Last In, First Out**

This means:

> The **last element inserted** is the **first element removed**.

---

# Real Life Example 1 - Stack of Plates

Imagine plates in a hotel.

```
     Plate 5  ← Last plate kept
     Plate 4
     Plate 3
     Plate 2
     Plate 1
```

If you want to take one plate,

Which plate comes first?

✅ Plate 5

Not Plate 1.

Exactly how a Stack works.

---

# Real Life Example 2 - Browser Back Button

Suppose you visit

```
Google

↓

YouTube

↓

GitHub

↓

ChatGPT
```

Now press Back.

Where do you go?

```
GitHub
```

Press again

```
YouTube
```

Press again

```
Google
```

This is Stack.

---

# Real Life Example 3 - Undo

Suppose you're typing in MS Word.

```
Hello

↓

Hello Java

↓

Hello Java Collections

↓

Hello Java Collections Framework
```

Press Undo.

You return to

```
Hello Java Collections
```

Undo again

```
Hello Java
```

Again

```
Hello
```

Again...

Everything is happening using a Stack.

---

# Stack Hierarchy

```
Collection
      │
     List
      │
    Vector
      │
     Stack
```

That means Stack inherits all methods of Vector.

But it also provides its own special methods.

---

# Creating a Stack

```java
import java.util.Stack;

Stack<String> books = new Stack<>();
```

---

# Method 1 : push()

Adds an element to the top.

```java
books.push("Java");
books.push("Python");
books.push("C++");
```

Stack becomes

```
Top

C++

Python

Java
```

---

# Method 2 : pop()

Removes the top element.

```java
books.pop();
```

Removed

```
C++
```

Remaining

```
Top

Python

Java
```

---

# Method 3 : peek()

Suppose you only want to see the top element.

Don't remove it.

Use

```java
books.peek();
```

Output

```
Python
```

Stack remains unchanged.

---

# Difference

```
peek()

↓

View

↓

Don't remove
```

```
pop()

↓

Remove

↓

Return removed element
```

---

# Method 4 : empty()

Checks whether the stack is empty.

```java
books.empty();
```

Returns

```
true
```

or

```
false
```

---

# Method 5 : search()

This is unique.

Suppose

```
Top

Python

Java

C++
```

Now

```java
books.search("Java");
```

Output

```
2
```

Why?

Because search counts **from the top**, not from the bottom.

```
Top

Python ← 1

Java ← 2

C++ ← 3
```

Very important interview question.

---

# Complete Example

```java
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C++");

        System.out.println(books);

        System.out.println("Top : " + books.peek());

        System.out.println("Removed : " + books.pop());

        System.out.println(books);

        System.out.println("Empty ? " + books.empty());

        System.out.println("Position of Java : " + books.search("Java"));

    }
}
```

Output

```
[Java, Python, C++]

Top : C++

Removed : C++

[Java, Python]

Empty ? false

Position of Java : 2
```

---

# Internal Working

Stack internally uses **Vector**.

When you call

```java
push("Java");
```

Internally it is similar to

```
Vector.addElement("Java");
```

When you call

```java
pop();
```

Internally

```
Remove last element
```

So Stack is basically a specialized Vector that only allows access to the top.

---

# Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| push()    | O(1)       |
| pop()     | O(1)       |
| peek()    | O(1)       |
| empty()   | O(1)       |
| search()  | O(n)       |

---

# Real World Applications

Stacks are used in:

* Browser Back/Forward
* Undo & Redo
* Function Calls (Call Stack)
* Expression Evaluation
* Parentheses Matching
* Backtracking Algorithms
* DFS (Depth First Search)

---

# Interview Questions

### Q1

What is LIFO?

---

### Q2

Difference between `peek()` and `pop()`?

---

### Q3

Why does Stack extend Vector?

---

### Q4

Is Stack synchronized?

*(Hint: Think about Vector.)*

---

### Q5

What is the time complexity of `push()`?

---

# Assignment

Create a class called **StackDemo**.

Requirements:

1. Create a `Stack<String>` called `tasks`.
2. Push these tasks:

   * Study Java
   * Practice SQL
   * Learn Spring Boot
   * Revise Collections
3. Print the stack.
4. Display the top task using `peek()`.
5. Remove the top task using `pop()`.
6. Print the updated stack.
7. Check whether the stack is empty.
8. Search for `"Practice SQL"`.
9. Keep popping elements until the stack becomes empty.
10. Print `"All tasks completed!"`.

---

# 🧠 Interview Challenge

Without running the code, tell me the output:

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());
System.out.println(stack.peek());
System.out.println(stack.search(10));
System.out.println(stack.empty());
```


# Mentor Challenge ⭐

This is your first data structure where I want you to **visualize** every operation.

Whenever you write:

```java
stack.push(50);
```

Don't think:

> "A method was called."

Think:

```
Top
50
30
20
10
```

When you write:

```java
stack.pop();
```

Mentally visualize:

```
50

↓

Removed

Top
30
20
10
```

This habit will become incredibly valuable when we later study **Queues**, **Trees**, and **Graphs**.

---
