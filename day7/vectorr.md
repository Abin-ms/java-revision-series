
# Topic 6: Vector

## Lesson Plan


1. What is Vector?
2. Why was it introduced?
3. How is it different from ArrayList?
4. What is Synchronization?
5. Thread Safety
6. Capacity Increment
7. Time Complexity
8. Interview Questions
9. Coding Assignment

---

# 1. What is Vector?

`Vector` is a **class** in the Java Collections Framework that implements the **List** interface.

Hierarchy:

```text
Collection
      │
     List
      │
 ┌──────────────┐
 │              │
ArrayList     Vector
```

So just like `ArrayList`, it

* Maintains insertion order ✅
* Allows duplicates ✅
* Supports indexing ✅
* Has dynamic size ✅

Example:

```java
Vector<String> fruits = new Vector<>();

fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

System.out.println(fruits);
```

Output

```text
[Apple, Banana, Orange]
```

---

# 2. Why was Vector introduced?

To understand this, we need a little history.

### Before Java Collections Framework

When Java was first released (Java 1.0), there was **no `ArrayList`**.

Developers only had classes like:

* Vector
* Hashtable
* Stack

Later, Java introduced the Collections Framework in Java 1.2.

That's when `ArrayList` was added.

So,

```text
Vector

↓

Older (Legacy)
```

```text
ArrayList

↓

Newer
```

---

# 3. Internal Working

Here's something interesting.

### Question

How do you think `Vector` stores data?

A) Linked List

B) Tree

C) Array

D) Hash Table

### Answer

✅ **Array**

Just like `ArrayList`.

Internally, it's conceptually similar to:

```java
Object[] elementData;
```

So both use a dynamic array internally.

---

# 4. Then why do we have both?

Because of one word:

# Synchronization

This is the biggest difference.

---

Imagine a notebook.

Two students write at the same time.

```text
Student A
      \
       Notebook
      /
Student B
```

Both may overwrite each other's work.

To prevent this,

only **one person writes at a time**.

That is synchronization.

---

# ArrayList

```text
Not synchronized
```

Multiple threads can access it simultaneously.

Faster

BUT

Not thread-safe.

---

# Vector

```text
Synchronized
```

Only one thread accesses it at a time.

Safer

BUT

Slightly slower.

---

# Example

Imagine two threads.

Thread 1

```java
vector.add("Java");
```

Thread 2

```java
vector.remove(0);
```

Since Vector synchronizes its methods,

Java allows one operation to finish before the other begins.

This avoids inconsistent data.

---

# What is Thread Safety?

A collection is **thread-safe** if multiple threads can use it without corrupting the data.

| Collection | Thread Safe? |
| ---------- | ------------ |
| ArrayList  | ❌ No         |
| Vector     | ✅ Yes        |

---

# Why is Vector slower?

Every important method is synchronized.

Example:

```java
vector.add()
```

Before executing,

Java locks the object.

```text
LOCK

↓

Execute add()

↓

UNLOCK
```

This locking and unlocking takes extra time.

Therefore,

```text
Vector

↓

Safer

↓

Slower
```

---

# Capacity Increment

This is another interview question.

When the vector becomes full,

it creates a larger array.

By default,

Vector usually doubles its capacity.

Example:

```text
10

↓

20

↓

40

↓

80
```

You can also specify a **capacity increment**.

```java
Vector<Integer> numbers = new Vector<>(10,5);
```

Meaning

```text
Initial capacity = 10

Increase by 5

10

↓

15

↓

20

↓

25
```

This feature is unique to `Vector`.

---

# Common Methods

Exactly like ArrayList.

```java
Vector<String> list = new Vector<>();

list.add("Java");

list.add("Python");

list.get(1);

list.set(0,"C++");

list.remove(1);

list.size();

list.contains("Java");
```

Nothing new here.

---

# Time Complexity

| Operation     | Complexity     |
| ------------- | -------------- |
| get(index)    | O(1)           |
| set(index)    | O(1)           |
| add(end)      | O(1) amortized |
| add(index)    | O(n)           |
| remove(index) | O(n)           |
| search        | O(n)           |

Exactly like ArrayList.

The only difference is synchronization overhead.

---

# ArrayList vs Vector

| Feature            | ArrayList | Vector |
| ------------------ | --------- | ------ |
| Synchronization    | ❌ No      | ✅ Yes  |
| Thread Safe        | ❌ No      | ✅ Yes  |
| Performance        | Faster    | Slower |
| Legacy             | No        | Yes    |
| Internal Structure | Array     | Array  |
| Recommended Today  | ✅ Yes     | Rarely |

---

# Should We Use Vector Today?

For most modern applications:

```text
NO
```

Instead,

* Use `ArrayList` for single-threaded applications.
* Use modern concurrent collections when thread safety is required.

You'll learn those when we study multithreading and concurrent collections later in your roadmap.

So nowadays,

`Vector` is mostly asked in **interviews** and found in **legacy code**.

---

# Interview Questions

### Q1

Why is Vector slower than ArrayList?

---

### Q2

What is synchronization?

---

### Q3

Is Vector thread-safe?

---

### Q4

Which uses more memory?

* ArrayList
* Vector

(Hint: Think carefully.)

---

### Q5

Should you use Vector in a new project today?

Why?

---



# 🧠 Interview Corner

Here's a question that interviewers love:

> **Interviewer:** "If Vector is thread-safe, why don't we always use it?"

A strong answer would be:

> "Because synchronization adds overhead. Most applications don't need every operation to be synchronized, so `ArrayList` is preferred for better performance. If thread safety is required, modern Java often uses specialized concurrent collections instead of `Vector`."

---
# Coding Assignment

Create a class named **VectorDemo**.

Requirements:

1. Create a `Vector<String>` named `languages`.
2. Add these languages:

   * Java
   * Python
   * C++
   * JavaScript
   * Go
3. Print the vector.
4. Insert `"Kotlin"` at index `2`.
5. Replace `"Go"` with `"Rust"`.
6. Remove `"Python"`.
7. Print all languages using:

   * Normal `for`
   * Enhanced `for`
   * `Iterator`
8. Print:

   * First element
   * Last element
   * Total number of elements
9. Check if `"Java"` exists.

---

