JAVA REVISION SERIES
│
├── 🟢 PHASE 1 — Java Fundamentals
│   ├── Variables & Data Types
│   ├── Operators
│   ├── Input / Output
│   ├── if / else
│   ├── switch
│   ├── Loops
│   ├── Patterns
│   └── Methods
│
├── 🟢 PHASE 2 — OOP
│   ├── Classes & Objects
│   ├── Constructors
│   ├── this / super
│   ├── Encapsulation
│   ├── Inheritance
│   ├── Polymorphism
│   ├── Method Overloading
│   ├── Method Overriding
│   ├── Abstraction
│   ├── Interfaces
│   └── static / final
│
├── 🟢 PHASE 3 — Core Java
│   ├── Strings
│   ├── Arrays
│   ├── Exception Handling
│   ├── File Handling
│   ├── Packages
│   ├── Access Modifiers
│   └── Wrapper Classes
│
├── 🟢 PHASE 4 — Collections & Generics
│   ├── List
│   ├── Set
│   ├── Queue
│   ├── Map
│   ├── Comparable / Comparator
│   ├── Generics
│   └── Wildcards
│
├── 🟢 PHASE 5 — Java 8+
│   ├── Functional Interfaces
│   ├── Lambda Expressions
│   ├── Predicate
│   ├── Consumer
│   ├── Supplier
│   ├── Function
│   ├── Stream API
│   └── Optional
│
│              👈 YOU ARE HERE
│
├── 🔜 PHASE 6 — Advanced Java
│   ├── Advanced Stream API
│   │   ├── flatMap()
│   │   ├── groupingBy()
│   │   ├── partitioningBy()
│   │   ├── joining()
│   │   └── summarizing
│   ├── Date & Time API
│   ├── Multithreading
│   ├── Synchronization
│   ├── ExecutorService
│   ├── Concurrent Collections
│   └── Java Memory Concepts
│
├── 🔜 PHASE 7 — Database & Backend
│   ├── JDBC
│   ├── SQL Integration
│   ├── Transactions
│   ├── Connection Pooling
│   └── CRUD Applications
│
├── 🔜 PHASE 8 — Modern Java Backend
│   ├── Maven / Gradle
│   ├── REST APIs
│   ├── Spring
│   ├── Spring Boot
│   ├── Spring MVC
│   ├── Spring Data JPA
│   ├── Hibernate
│   └── Spring Security
│
└── 🔜 PHASE 9 — Projects & Interview Prep
    ├── Java Projects
    ├── Backend Projects
    ├── DSA
    ├── SQL Interview Questions
    ├── Java Interview Questions
    ├── System Design Basics
    └── Final Revision



----

`

### 🧠 Key difference — remember this

| Method             | Purpose                                                       |
| ------------------ | ------------------------------------------------------------- |
| `groupingBy()`     | Creates groups based on a key — potentially many groups       |
| `partitioningBy()` | Splits elements into exactly **2 groups**: `true` and `false` |

For example:

```java
groupingBy(n -> n % 3)
```

can produce:

```text
0 → ...
1 → ...
2 → ...
```

Whereas:

```java
partitioningBy(n -> n % 2 == 0)
```

produces only:

```text
true  → even
false → odd
```

## 🚀 Next: `joining()`

`joining()` is used to **combine strings from a Stream into one String**.

Example:

```java
List<String> names = Arrays.asList("Abin", "Rahul", "John");

String result = names.stream()
        .collect(Collectors.joining());

System.out.println(result);
```

Output:

```text
AbinRahulJohn
```

You can also provide a separator:

```java
String result = names.stream()
        .collect(Collectors.joining(", "));

System.out.println(result);
```

Output:

```text
Abin, Rahul, John
```

And even prefix + suffix:

```java
String result = names.stream()
        .collect(Collectors.joining(", ", "[", "]"));

System.out.println(result);
```

Output:

```text
[Abin, Rahul, John]
```

