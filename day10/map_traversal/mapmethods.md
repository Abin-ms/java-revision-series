

| Method              | Main use                                                   |
| ------------------- | ---------------------------------------------------------- |
| `putIfAbsent()`     | Add only if the key doesn't already exist                  |
| `getOrDefault()`    | Get value, or a backup value if key doesn't exist          |
| `replace()`         | Replace the value of an existing key                       |
| `replaceAll()`      | Modify **all values** in the map                           |
| `computeIfAbsent()` | Create and insert a value **only when the key is missing** |

### 1. `putIfAbsent()`

**Use:** Add a value only if the key is not already present.

```java
map.putIfAbsent(101, "Abin");
```

If `101` already exists → **nothing happens**.

---

### 2. `getOrDefault()`

**Use:** Get a value safely with a fallback.

```java
String name = map.getOrDefault(999, "Unknown");
```

If `999` exists → returns its value.

If `999` doesn't exist → returns `"Unknown"`.

---

### 3. `replace()`

**Use:** Change the value of an existing key.

```java
map.replace(101, "Rahul");
```

If `101` exists:

```text
101 → Abin
```

becomes:

```text
101 → Rahul
```

If `101` doesn't exist → nothing is added.

---

### 4. `replaceAll()`

**Use:** Modify **every value** in the map.

```java
map.replaceAll((id, name) -> name.toUpperCase());
```

Before:

```text
101 → Abin
102 → Rahul
```

After:

```text
101 → ABIN
102 → RAHUL
```

---

### 5. `computeIfAbsent()`

**Use:** Generate/create a value when a key **doesn't exist**.

Example:

```java
map.computeIfAbsent(101, id -> "Student-" + id);
```

If `101` already exists → keep the existing value.

If `101` doesn't exist → create:

```text
101 → Student-101
```

It's especially useful when the value needs to be **calculated/generated** rather than simply supplied.

### 🧠 Easy memory trick

```text
putIfAbsent()      → PUT if missing
getOrDefault()     → GET or fallback
replace()          → REPLACE one
replaceAll()       → REPLACE all
computeIfAbsent()  → CALCULATE + PUT if missing
```