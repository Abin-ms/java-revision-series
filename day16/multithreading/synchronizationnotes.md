
# What is synchronization?

Synchronization is a mechanism that coordinates multiple threads accessing shared resources to prevent race conditions and maintain data consistency.

For example, in your `pg18` bank balance program, two threads deposit money into the same `balance` variable. Synchronization ensures that both updates are performed safely.

Java provides several ways to achieve synchronization. The main approaches to learn first are below.

## 1. Synchronized instance method

The `synchronized` keyword is applied to a non-static method.

```
class BankAccount {
    int balance = 1000;

    synchronized void deposit(int amount) {
        balance = balance + amount;
    }
}
```

How it works:

- A thread must acquire the monitor lock of the current object (`this`) before entering the method.
- Another thread calling a synchronized instance method protected by that same object lock must wait until the lock is released.
- The lock is released when the method exits, including when it exits because of an exception.

Example:

```
BankAccount account = new BankAccount();

Thread t1 = new Thread(() -> account.deposit(500));
Thread t2 = new Thread(() -> account.deposit(300));

t1.start();
t2.start();
```

Both threads share the same `account` object, so they compete for the same monitor lock.

Important: If each thread uses a different `BankAccount` object, their instance-method locks are different, so this alone will not coordinate access to shared data across those objects.

## 2. Synchronized static method

The `synchronized` keyword is applied to a `static` method.

```
class BankAccount {
    static int balance = 1000;

    static synchronized void deposit(int amount) {
        balance = balance + amount;
    }
}
```

How it works:

- The lock belongs to the class's `Class` object, such as `BankAccount.class`.
- Only one thread at a time can execute a static synchronized method protected by that same class lock.
- This is useful when protecting static shared data.

Your `pg18` program used this approach:

```
static synchronized void deposit(int amount) {
    balance = balance + amount;
}
```

Because both threads call the same static method, they use the same class-level lock.

Remember: An instance synchronized method locks `this`; a static synchronized method locks the class object.

## 3. Synchronized block

Instead of locking an entire method, you can synchronize only the section that accesses shared data.

```
class BankAccount {
    int balance = 1000;

    void deposit(int amount) {
        synchronized (this) {
            balance = balance + amount;
        }
    }
}
```

How it works:

- The thread acquires the lock on the specified object.
- It executes the synchronized block.
- It releases the lock when it exits the block.

Why use this approach? Sometimes only a few lines need protection. Keeping the critical section small can allow more work to happen concurrently.

A synchronized block can also use a dedicated lock object:

```
private final Object lock = new Object();

void deposit(int amount) {
    synchronized (lock) {
        balance = balance + amount;
    }
}
```

This is useful when you want to control access with a private lock rather than locking the entire object.

## 4. Static synchronized block

Java does not have a separate `static synchronized { ... }` block syntax. Instead, use a synchronized block with the class object:

```
class BankAccount {
    static int balance = 1000;

    static void deposit(int amount) {
        synchronized (BankAccount.class) {
            balance = balance + amount;
        }
    }
}
```

This protects the update with the same class-level monitor used by `static synchronized` methods of `BankAccount`.

It is useful when you need class-level locking for only part of a static method.

## 5. `Lock` interface — explicit locking

Java also provides explicit locks through `java.util.concurrent.locks.Lock`, commonly using `ReentrantLock`.

```
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    int balance = 1000;

    private final Lock lock = new ReentrantLock();

    void deposit(int amount) {
        lock.lock();
        try {
            balance = balance + amount;
        } finally {
            lock.unlock();
        }
    }
}
```

How it works:

1. `lock.lock()` acquires the lock.
2. The critical section updates the balance.
3. The `finally` block releases the lock, even if an exception occurs.

Unlike `synchronized`, explicit locks offer additional capabilities, such as `tryLock()` and interruptible lock acquisition.

Important: All threads that need coordinated access must use the same lock instance. A separate lock for each thread will not protect the shared balance.

## Comparison of the approaches

| Approach                         | Lock used               | Best suited for                        |
| -------------------------------- | ----------------------- | -------------------------------------- |
| Synchronized instance method     | Current object (`this`) | Protecting an entire instance method   |
| Synchronized static method       | Class object            | Protecting class-level shared data     |
| Synchronized block               | Chosen object's monitor | Protecting a specific critical section |
| `synchronized (ClassName.class)` | Class object            | Protecting part of a static operation  |
| `ReentrantLock`                  | Explicit lock instance  | More advanced locking control          |

## One more distinction: Other thread-safety tools

Synchronization is not the only way to coordinate concurrent access. Java also provides:

- Atomic classes, such as `AtomicInteger`, for thread-safe atomic operations on individual values.
- Concurrent collections, such as `ConcurrentHashMap`, for thread-safe collection operations.
- Semaphores, which limit how many threads can access a resource at once.
- Read-write locks, which allow multiple readers while coordinating writes.

These are related concurrency tools, but they are not all equivalent to Java's `synchronized` keyword.

## What should you remember for interviews?

1. `synchronized` instance methods lock the current object.
2. `static synchronized` methods lock the class object.
3. Synchronized blocks protect only a chosen critical section.
4. `ReentrantLock` provides more explicit control over locking.
5. Synchronization prevents race conditions only when the threads use the appropriate shared lock.
6. `join()` waits for a thread to finish; it does not itself protect shared data from race conditions.

For your current learning roadmap: You've already implemented a synchronized static method in `pg18`. Next, practice a synchronized block, then move on to deadlock and how to prevent it. That will give you a stronger understanding without repeating the same deposit example again.
