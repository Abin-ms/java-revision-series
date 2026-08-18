

# Combining Predicates

Java gives `Predicate` three useful methods:

```java
and()
or()
negate()
```

## 1. `and()`

Both conditions must be `true`.

```java
Predicate<Integer> isPositive = n -> n > 0;
Predicate<Integer> isEven = n -> n % 2 == 0;

Predicate<Integer> positiveAndEven =
        isPositive.and(isEven);

System.out.println(positiveAndEven.test(10));  // true
System.out.println(positiveAndEven.test(-10)); // false
System.out.println(positiveAndEven.test(7));   // false
```

Think:

```text
positive AND even
       ↓
 both must be true
```

---

## 2. `or()`

At least one condition must be `true`.

```java
Predicate<Integer> positiveOrEven =
        isPositive.or(isEven);

System.out.println(positiveOrEven.test(7));   // true
System.out.println(positiveOrEven.test(-8));  // true
System.out.println(positiveOrEven.test(-7));  // false
```

For `-8`:

```text
positive → false
even     → true
             ↓
            OR
             ↓
           true
```

---

## 3. `negate()`

Reverses the result.

```java
Predicate<Integer> isOdd =
        isEven.negate();

System.out.println(isOdd.test(7));   // true
System.out.println(isOdd.test(10));  // false
```

Basically:

```text
true  → false
false → true
```

---

# 🧠 Easy memory

```text
and()    → BOTH conditions
or()     → ANY condition
negate() → REVERSE result
```

