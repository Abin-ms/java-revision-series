

---

#  `Function.compose()`

`compose()` does the **opposite order**.

Using the same functions:

```java
Function<Integer, Integer> multiplyBy2 =
        number -> number * 2;

Function<Integer, Integer> add5 =
        number -> number + 5;
```

If we write:

```java
Function<Integer, Integer> result =
        multiplyBy2.compose(add5);
```

the order becomes:

```text
10
 ↓
add5
 ↓
15
 ↓
multiplyBy2
 ↓
30
```

So:

```java
andThen()
```

means:

```text
A → B
```

while:

```java
compose()
```

means:

```text
B → A
```

### Easy way to remember

```text
andThen:
first function → then second function

compose:
argument function → then the function calling compose()
```
---

### Example program
---
import java.util.function.Function;

public class functionex3 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = number -> number * 2;
        Function<Integer, Integer> add5 = number -> number + 5;

        Function<Integer, Integer> result = multiplyBy2.compose(add5);

        System.out.println(result.apply(5));

        System.out.println(result.apply(10));
    }

}
---
output :
20 
30

