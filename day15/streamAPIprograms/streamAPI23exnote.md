## breif on the 23 Question / 23 streamexample
 

### code 
package day15.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class streamAPIex23 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 15, 20, 25, 30, 35, 40);

        OptionalDouble result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average();

        System.out.println(result);

    }
}

---


program's goal is:

> **Find the average of all even numbers in the list.**

Your list is:

```text
10, 15, 20, 25, 30, 35, 40
```

The even numbers are:

```text
10, 20, 30, 40
```

Their average is `25.0`.

---

# 1. Package

```java
package day15.streamAPIprograms;
```

This tells Java that your class belongs to the `day15.streamAPIprograms` package.

It is mainly used for organizing Java classes.

---

# 2. Import `Arrays`

```java
import java.util.Arrays;
```

We use:

```java
Arrays.asList()
```

to create our list.

Without this import, Java won't know what `Arrays` refers to.

---

# 3. Import `List`

```java
import java.util.List;
```

We are creating:

```java
List<Integer> numbers
```

So we need the `List` class.

---

# 4. Import `OptionalDouble`

```java
import java.util.OptionalDouble;
```

This is important because:

```java
.average()
```

returns an `OptionalDouble`.

We'll see why shortly.

---

# 5. Class

```java
public class streamAPIex23 {
```

This creates your Java class.

---

# 6. Main method

```java
public static void main(String[] args) {
```

This is where Java starts executing the program.

Everything inside `main()` runs from top to bottom.

---

# 7. Creating the List

```java
List<Integer> numbers = Arrays.asList(
        10, 15, 20, 25, 30, 35, 40
);
```

We create a list containing:

```text
10
15
20
25
30
35
40
```

The type is:

```java
List<Integer>
```

because every element is an `Integer`.

So:

```text
numbers
 ↓
[10, 15, 20, 25, 30, 35, 40]
```

---

# 8. `numbers.stream()`

Now comes the Stream API:

```java
numbers.stream()
```

This converts the List into a Stream.

Before:

```text
List<Integer>
```

After:

```text
Stream<Integer>
```

Think of a Stream as a **pipeline through which each element travels**.

Our pipeline starts as:

```text
10 → 15 → 20 → 25 → 30 → 35 → 40
```

---

# 9. `filter()`

Next:

```java
.filter(n -> n % 2 == 0)
```

`filter()` means:

> Keep only the elements that satisfy a condition.

Our condition is:

```java
n -> n % 2 == 0
```

Let's break it down.

### `n`

`n` represents one number at a time.

For example:

```text
n = 10
n = 15
n = 20
...
```

### `n % 2`

`%` is the remainder operator.

For example:

```text
10 % 2 = 0
15 % 2 = 1
20 % 2 = 0
```

An even number always has a remainder of `0` when divided by `2`.

Therefore:

```java
n % 2 == 0
```

means:

> Is `n` even?

---

## Let's trace the filter

| Number | `n % 2` | Condition | Result   |
| -----: | ------: | --------- | -------- |
|     10 |       0 | `0 == 0`  | ✅ Keep   |
|     15 |       1 | `1 == 0`  | ❌ Remove |
|     20 |       0 | `0 == 0`  | ✅ Keep   |
|     25 |       1 | `1 == 0`  | ❌ Remove |
|     30 |       0 | `0 == 0`  | ✅ Keep   |
|     35 |       1 | `1 == 0`  | ❌ Remove |
|     40 |       0 | `0 == 0`  | ✅ Keep   |

So after `filter()`:

```text
10, 20, 30, 40
```

The important thing is:

```java
.filter(n -> n % 2 == 0)
```

**doesn't calculate the average.**

It only selects the even numbers.

---

# 10. `mapToInt()`

Now:

```java
.mapToInt(n -> n)
```

This is an important part.

Before this:

```text
Stream<Integer>
```

After filtering, we still have:

```text
Stream<Integer>
```

But `average()` is not directly available on `Stream<Integer>`.

We need an `IntStream`.

That's what:

```java
mapToInt()
```

does.

It converts:

```text
Stream<Integer>
       ↓
   IntStream
```

The lambda:

```java
n -> n
```

simply means:

> Take the Integer `n` and convert/use its value as an `int`.

So:

```text
10, 20, 30, 40
       ↓
IntStream
       ↓
10, 20, 30, 40
```

The values don't change.

The **type of stream changes**.

That's the important part.

---

# 11. Why do we need `mapToInt()`?

This is the key concept.

If we had:

```java
numbers.stream()
    .filter(...)
    .average();
```

it wouldn't work because:

```text
Stream<Integer>
```

doesn't have the `average()` method.

But:

```text
IntStream
```

does have:

```text
sum()
average()
min()
max()
```

So we do:

```java
.mapToInt(n -> n)
```

to get an `IntStream`.

Think:

```text
Stream<Integer>
       ↓
mapToInt()
       ↓
IntStream
       ↓
average()
```

---

# 12. `average()`

Now:

```java
.average();
```

At this point our stream contains:

```text
10, 20, 30, 40
```

`average()` calculates their arithmetic mean.

Conceptually:

genui{"learning_viz":{"type_id":"ARITHMETIC_MEAN","initial_values":{"observation1":10,"observation2":20,"observation3":30},"locale_override":"en-IN"}}

The calculation is:

```text
10 + 20 + 30 + 40 = 100
```

Number of values:

```text
4
```

Therefore:

```text
100 / 4 = 25.0
```

So the result is:

```text
25.0
```

---

# 13. Why `OptionalDouble`?

This line:

```java
OptionalDouble result = ...
```

may look strange.

Why not simply:

```java
double result
```

?

Because imagine our list was:

```text
[11, 15, 21, 25]
```

There are **no even numbers**.

After:

```java
.filter(n -> n % 2 == 0)
```

we would have:

```text
empty stream
```

So what would the average be?

There is no average.

Java therefore doesn't simply return a meaningless number. It uses:

```java
OptionalDouble
```

which can contain:

```text
25.0
```

or be empty:

```text
OptionalDouble.empty
```

In your program:

```text
OptionalDouble[25.0]
```

means:

> An average exists, and its value is `25.0`.

---

# 14. `System.out.println(result)`

Finally:

```java
System.out.println(result);
```

This prints the `OptionalDouble`.

So you get:

```text
OptionalDouble[25.0]
```

Notice that it doesn't print just:

```text
25.0
```

because `result` is an `OptionalDouble`, not a normal `double`.

If you wanted just the number, you could do:

```java
System.out.println(result.orElse(0.0));
```

Output:

```text
25.0
```

`orElse(0.0)` means:

> If the Optional contains a value, give me that value. Otherwise give me `0.0`.

---

# 🔥 Entire program flow

This is the most important part to remember:

```text
List
 ↓
[10, 15, 20, 25, 30, 35, 40]
 ↓
stream()
 ↓
Stream<Integer>
 ↓
filter(n -> n % 2 == 0)
 ↓
[10, 20, 30, 40]
 ↓
mapToInt(n -> n)
 ↓
IntStream
 ↓
average()
 ↓
OptionalDouble[25.0]
 ↓
println()
```

---

# 🧠 What each function is doing

| Function          | What it does                                         |
| ----------------- | ---------------------------------------------------- |
| `Arrays.asList()` | Creates a List                                       |
| `stream()`        | Converts List into Stream                            |
| `filter()`        | Selects elements based on a condition                |
| `n % 2 == 0`      | Checks whether number is even                        |
| `mapToInt()`      | Converts `Stream<Integer>` to `IntStream`            |
| `n -> n`          | Keeps the integer value while converting stream type |
| `average()`       | Calculates the average                               |
| `OptionalDouble`  | Stores an average that may or may not exist          |
| `println()`       | Prints the result                                    |

### ⭐ The main thing to remember for this problem

```java
numbers.stream()
    .filter(n -> n % 2 == 0)
    .mapToInt(n -> n)
    .average();
```

Read it in English:

> **Take the numbers → keep only even numbers → convert them to an IntStream → calculate their average.**

