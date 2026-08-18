Let's gooo bro 🔥

# `? extends Number` — Upper-Bounded Wildcard

We just learned:

```java
List<?> 
```

means:

> A list of some unknown type.

Now we can put a **boundary** on that unknown type:

```java
List<? extends Number>
```

This means:

> A `List` containing `Number` or any class that extends `Number`.

### What can it accept?

```java
List<Integer> numbers = Arrays.asList(10, 20, 30);
List<Double> decimals = Arrays.asList(10.5, 20.5);
List<Float> floats = Arrays.asList(10.5f, 20.5f);
```

All can be passed to:

```java
displayNumbers(...)
```

But:

```java
List<String> names
```

cannot.

---

## Example

```java
public static void displayNumbers(List<? extends Number> list) {

    for (Number n : list) {
        System.out.println(n);
    }
}
```

Then:

```java
displayNumbers(numbers);
displayNumbers(decimals);
displayNumbers(floats);
```

works.

Why can we use:

```java
Number n = list.get(0);
```

?

Because whatever the actual type is, we know it is at least a `Number`.

```text
Integer ──┐
Double  ──┤
Float   ──┼──→ Number
Long    ──┤
          ┘
```

---

# ⚠️ But here's the important part

You **cannot add** a specific number:

```java
list.add(10);       // ❌
list.add(10.5);     // ❌
```

Why?

Because Java doesn't know which subtype the list actually is.

It could be:

```java
List<Integer>
```

If Java allowed:

```java
list.add(10.5);
```

we'd put a `Double` into a `List<Integer>`.

So:

```text
List<? extends Number>

READ → ✅
ADD  → ❌
```

This is the same pattern we saw with `List<?>`.

---

# 🧠 Now the famous rule

You'll often hear:

> **PECS**

### P → Producer → `extends`

If you're **getting/reading** values:

```java
List<? extends Number>
```

Think:

```text
PRODUCER → EXTENDS
```

### C → Consumer → `super`

If you're **putting/adding** values:

```java
List<? super Integer>
```

Think:

```text
CONSUMER → SUPER
```

