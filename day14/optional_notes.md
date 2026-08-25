![alt text](image.png)


---
![alt text](image-1.png)
![alt text](image-2.png)
![alt text](image-3.png)
![alt text](image-4.png)

---

![alt text](image-5.png)
![alt text](image-6.png)

---

###  ofNullable() vs of()

`Optional.ofNullable()` creates an `Optional` object that **may or may not contain a non-null value**.

It prevents `NullPointerException` (NPE) by wrapping a variable that could potentially be `null`.

---

**How It Works**

* If the passed value is **non-null**, it returns an `Optional` containing that value.
* If the passed value is **null**, it returns an empty `Optional` (`Optional.empty()`) instead of throwing a `NullPointerException`.

---

**`ofNullable()` vs `of()**`

| Method | Behavior with `null` | When to Use |
| --- | --- | --- |
| `Optional.of(value)` | Throws `NullPointerException` | When you are **100% sure** the value is never `null`. |
| `Optional.ofNullable(value)` | Returns `Optional.empty()` | When the value **might be null**. |

---

**Example Code**

```java
import java.util.Optional;

public class OfNullableExample {
    public static void main(String[] args) {
        String name = getUsername(); // Might return null

        // Safe creation without risk of NullPointerException
        Optional<String> nameOptional = Optional.ofNullable(name);

        // Provide a default fallback value if null
        String displayName = nameOptional.orElse("Guest");

        System.out.println("Hello, " + displayName);
    }

    private static String getUsername() {
        return null; // Simulating a missing value
    }
}

```

---

**Common Use Cases**

* **Avoiding Manual `if (x != null)` Checks:**
```java
// Traditional way
if (user != null && user.getAddress() != null) { ... }

// Modern Java way
String city = Optional.ofNullable(user)
                      .map(User::getAddress)
                      .map(Address::getCity)
                      .orElse("Unknown");

```


* **Handling Legacy API Returns:** When calling third-party libraries or standard methods that might return `null`.

---
Here are direct side-by-side examples showing when to use `Optional.of()` versus `Optional.ofNullable()`.

---

**1. `Optional.of()**`
Use this when you are **100% certain** the value is not `null`. If a `null` value is passed, it throws a `NullPointerException` immediately at the point of creation.

```java
import java.util.Optional;

public class OfExample {
    public static void main(String[] args) {
        String greeting = "Hello, Java!";

        // Safe because greeting is guaranteed not to be null
        Optional<String> opt = Optional.of(greeting);
        System.out.println(opt.get()); // Outputs: Hello, Java!

        // DANGER: Passing null to of() causes a crash
        String nullName = null;
        Optional<String> crashOpt = Optional.of(nullName); // Throws NullPointerException!
    }
}

```

---

**2. `Optional.ofNullable()**`
Use this when the value **might be `null**`. It safely wraps non-null values and produces an empty `Optional` when receiving `null`.

```java
import java.util.Optional;

public class OfNullableExample {
    public static void main(String[] args) {
        String value = getDatabaseUser(); // Might return "Alice" or null

        // Safe: Handles both non-null values and null without throwing an exception
        Optional<String> userOpt = Optional.ofNullable(value);

        // Fallback to "DefaultUser" if value was null
        String username = userOpt.orElse("DefaultUser");
        System.out.println("User: " + username);
    }

    private static String getDatabaseUser() {
        return null; // Simulating a missing record
    }
}

```

---

**Key Difference in Action**

```java
String input = null;

// Throws java.lang.NullPointerException
Optional<String> opt1 = Optional.of(input); 

// Returns Optional.empty() safely, no exception thrown
Optional<String> opt2 = Optional.ofNullable(input); 

```

