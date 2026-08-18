
# `Consumer<T>`

If `Predicate` is:

> **Take a value → check something → return `true/false`**

then `Consumer` is:

> **Take a value → perform an action → return nothing.**

It is from:

```java
import java.util.function.Consumer;
```

## 1. Basic example

```java
Consumer<String> printName =
        name -> System.out.println("Name: " + name);

printName.accept("Abin");
```

Output:

```text
Name: Abin
```

### Notice the method

For `Predicate` we used:

```java
predicate.test(value);
```

For `Consumer` we use:

```java
consumer.accept(value);
```

---

## 2. Why `Consumer` doesn't return anything

For example:

```java
Consumer<Integer> printSquare =
        n -> System.out.println(n * n);

printSquare.accept(5);
```

Output:

```text
25
```

The lambda **does something**—it prints the square—but it doesn't return a value.

So:

```text
Predicate<T>
     ↓
T → boolean
     ↓
test()

Consumer<T>
     ↓
T → nothing
     ↓
accept()
```

---

# 3. Consumer with multiple statements

You can use `{}` when you need multiple statements:

```java
Consumer<String> processName = name -> {
    System.out.println("Processing...");
    System.out.println("Name: " + name);
    System.out.println("Length: " + name.length());
};

processName.accept("Abin");
```

---

# 4. Consumer with a collection

This is where you've **already used Consumer without realizing it**:

```java
students.forEach((id, name) -> {
    System.out.println(id + " → " + name);
});
```

The lambda passed to `forEach()` is essentially acting as a `Consumer` of each element/entry.

That's why `Consumer` will feel familiar.

---

## 🧠 Easy memory

```text
Predicate
→ asks a question
→ returns boolean
→ test()

Consumer
→ does an action
→ returns nothing
→ accept()
```

