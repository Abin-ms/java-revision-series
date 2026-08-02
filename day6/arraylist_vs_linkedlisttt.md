Perfect! 🔥 Now we begin what I consider the **most important comparison in the Collections Framework**.

# Topic 5: LinkedList

Today, you're not just going to learn `LinkedList`. You're going to understand **why Java has both `ArrayList` and `LinkedList`**.

By the end of this lesson, you'll be able to answer one of the most common interview questions:

> **"When would you choose ArrayList over LinkedList?"**

---

# Lesson Plan

We'll cover:

1. Why LinkedList was introduced
2. What is LinkedList?
3. Internal Working
4. Node Structure
5. Doubly Linked List
6. Operations
7. Time Complexity
8. ArrayList vs LinkedList
9. Real-world Applications
10. Interview Questions
11. Coding Assignment

---

# Step 1: Why Was LinkedList Introduced?

Let's recall `ArrayList`.

Suppose we have:

```text
Index

0 Apple
1 Banana
2 Orange
3 Mango
```

Now insert:

```text
Grapes
```

at index `1`.

Result:

```text
0 Apple
1 Grapes
2 Banana
3 Orange
4 Mango
```

What happened?

```text
Banana → Shift
Orange → Shift
Mango → Shift
```

Every element after index 1 had to move.

This shifting makes insertion slow.

---

Now imagine a banking application.

Thousands of transactions are inserted and deleted every second.

Would shifting thousands of elements be efficient?

No.

Java needed another data structure.

That is **LinkedList**.

---

# Step 2: What is LinkedList?

Unlike `ArrayList`,

**LinkedList does NOT store elements inside one continuous array.**

Instead, it stores data inside **Nodes**.

Think of it like a train.

```text
[Engine] → [Coach1] → [Coach2] → [Coach3]
```

Each coach knows where the next coach is.

A LinkedList works exactly the same way.

---

# Step 3: What is a Node?

A Node is a small object containing:

* Data
* Address of next node
* Address of previous node

Conceptually:

```java
class Node {

    String data;

    Node next;

    Node previous;

}
```

Don't worry—you don't have to write this class. Java's `LinkedList` already does it internally.

---

# Visual Representation

Suppose we store:

```text
Apple
Banana
Orange
```

Internally:

```text
+---------+      +---------+      +---------+
| Apple   | ---> | Banana  | ---> | Orange  | ---> null
+---------+      +---------+      +---------+
```

But Java's `LinkedList` is actually a **doubly linked list**, so each node points both forward and backward:

```text
null
  ↑
+---------+ <----> +---------+ <----> +---------+
| Apple   |        | Banana  |        | Orange  |
+---------+ <----> +---------+ <----> +---------+
                                           ↓
                                         null
```

Each node stores:

* previous
* data
* next

---

# Why is insertion fast?

Suppose we insert:

```text
Mango
```

between Apple and Banana.

In `ArrayList`:

```text
Shift everything
```

In `LinkedList`:

Simply change the links.

Before:

```text
Apple -----> Banana
```

After:

```text
Apple -----> Mango -----> Banana
```

No shifting.

Only the references change.

That's why insertion is fast.

---

# Why is get(index) slow?

Suppose you want:

```java
list.get(9000);
```

In an `ArrayList`:

Java directly jumps to index 9000.

```text
O(1)
```

In a `LinkedList`:

Java starts at the beginning (or sometimes the end, whichever is closer) and follows node by node until it reaches the requested index.

```text
Node 1

↓

Node 2

↓

Node 3

↓

...

↓

Node 9000
```

So accessing by index is generally:

```text
O(n)
```

---

# Time Complexity

| Operation         |      ArrayList | LinkedList |
| ----------------- | -------------: | ---------: |
| get(index)        |           O(1) |       O(n) |
| add(end)          | O(1) amortized |       O(1) |
| add(beginning)    |           O(n) |       O(1) |
| add(middle)       |           O(n) |      O(n)* |
| remove(beginning) |           O(n) |       O(1) |
| remove(end)       |           O(1) |       O(1) |
| search            |           O(n) |       O(n) |

> **Important:** For insertion or removal in the middle, `LinkedList` still has to **find the node first**, which takes O(n). Once the node is found, updating the links is O(1).

This is a very common interview point.

---

# ArrayList vs LinkedList

| Feature             | ArrayList        | LinkedList                    |
| ------------------- | ---------------- | ----------------------------- |
| Internal Structure  | Dynamic Array    | Doubly Linked List            |
| Random Access       | Fast             | Slow                          |
| Insert at Beginning | Slow             | Fast                          |
| Remove at Beginning | Slow             | Fast                          |
| Memory Usage        | Less             | More (stores node references) |
| Best For            | Frequent reading | Frequent insertions/removals  |

---

# Real-Life Examples

### Use ArrayList

* Product catalog
* Student records
* Playlist
* Search results

Reason:

You mostly read data.

---

### Use LinkedList

* Browser history
* Undo/Redo operations
* Music playlist with next/previous navigation
* Task scheduling

Reason:

Frequent insertions, removals, and moving forward/backward.

---

# LinkedList Methods

The nice thing is that **LinkedList implements the `List` interface**, so methods like these are familiar:

```java
LinkedList<String> list = new LinkedList<>();

list.add("Apple");
list.add("Banana");

System.out.println(list);

list.get(1);

list.set(0, "Mango");

list.remove(1);
```

Everything you've learned with `ArrayList` still works.

---

# Additional LinkedList Methods

Because it's also useful as a queue/deque, `LinkedList` provides extra methods:

```java
list.addFirst("A");

list.addLast("Z");

list.getFirst();

list.getLast();

list.removeFirst();

list.removeLast();
```

These are not available on the `List` interface, so the reference type must be `LinkedList`:

```java
LinkedList<String> list = new LinkedList<>();
```

instead of

```java
List<String> list = new LinkedList<>();
```

if you want to call `addFirst()` or `getLast()`.

---

# Interview Questions

### Q1

Why does LinkedList use more memory than ArrayList?

---

### Q2

Why is `get(index)` slow?

---

### Q3

Why is insertion at the beginning O(1)?

---

### Q4

When would you choose LinkedList instead of ArrayList?

---

### Q5

Can LinkedList contain duplicate elements?

---

# Assignment

Create a program named **LinkedListDemo**.

Requirements:

1. Create a `LinkedList<String>` of your favorite movies.
2. Add 5 movies.
3. Add one movie at the beginning.
4. Add one movie at the end.
5. Print the first and last movie.
6. Remove the first movie.
7. Remove the last movie.
8. Print all movies using a `for-each` loop.
9. Print the total number of movies.

---

# Mentor Tip ⭐

This is one of the biggest misconceptions beginners have:

> **"LinkedList is always faster than ArrayList."**

❌ That's **false**.

`LinkedList` is **only faster for specific operations**, mainly when you already have a reference to the node you're inserting or removing.

For random access (`get(index)`), `ArrayList` is much faster.

---

## Before You Code

I want to ask you one question.

Suppose you're building an **Instagram feed** where users mostly **scroll and read posts**. Posts are loaded in order, and random access by position is common.

**Which would you choose?**

* A) `ArrayList`
* B) `LinkedList`

And more importantly, **why?**

Think about the operations the application performs most often before answering. This is exactly how software engineers choose data structures.
