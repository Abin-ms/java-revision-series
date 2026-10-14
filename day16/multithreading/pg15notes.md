
# Program 15 — Interrupting a Thread in Java

## 1. The complete corrected program

```

package day16.multithreading;

public class pg15 {

    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Worker started");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            System.out.println("Worker finished");
        };

        Thread t1 = new Thread(task);
        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        t1.interrupt();
    }
}

```

Expected output:

```
Worker started
```

The worker starts, waits briefly, and is interrupted before completing its five-second sleep. Therefore, `"Worker finished"` is not printed.

## 2. What are we trying to achieve?

Imagine two people:

- Main thread: The manager who starts a task.
- Worker thread: An employee doing the task.

The manager tells the employee to start working and waits for one second. Then the manager sends a message asking the employee to stop waiting and handle the interruption.

The worker is sleeping for five seconds, so it receives the interruption immediately through an `InterruptedException`.

This is what we're demonstrating: how one thread can request that another thread stop its current interruptible operation.

An interruption is a request, not a command that forcibly kills the thread.

## 3. Line-by-line explanation

### Part A — Creating the task

```
Runnable task = () -> {
```

- `Runnable` is an interface that represents a task to execute.
- `task` stores the instructions the worker should perform.
- `() -> {}` is a lambda expression implementing the `Runnable` interface's `run()` method.

Think of `Runnable` as a list of instructions. It describes the work but does not create or start a thread by itself.

### Part B — Printing the starting message

```
System.out.println("Worker started");
```

When the worker begins executing its task, it prints:

```
Worker started
```

This confirms that the worker has begun its execution.

### Part C — Putting the worker to sleep

```
try {
    Thread.sleep(5000);
}
```

`Thread.sleep(5000)` pauses the currently executing thread for approximately five seconds.

Here, the currently executing thread is the worker, because this code runs inside its `run()` method.

Why do we use `try`?

Because `Thread.sleep()` can throw a checked exception called `InterruptedException`. Java requires us to handle it or declare it.

### Part D — Handling the interruption

```
catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return;
}
```

This is the most important part of the program.

Let's break it down.

Line 1:

```
catch (InterruptedException e)
```

If the worker is interrupted while sleeping, `Thread.sleep(5000)` throws an `InterruptedException`, and execution enters this catch block.

Line 2:

```
Thread.currentThread().interrupt();
```

`Thread.currentThread()` returns the thread that is currently executing this code — in this case, the worker.

Calling `interrupt()` on it restores its interrupt status.

Why restore the status? When `InterruptedException` is thrown by `sleep()`, the thread's interrupt status is cleared. Restoring it preserves the interruption information so other code can detect it.

Line 3:

```
return;
```

This exits the lambda task immediately.

Without `return`, execution would continue after the catch block and reach:

```
System.out.println("Worker finished");
```

That would incorrectly print `"Worker finished"` even though the worker was interrupted before completing its sleep.

So, `return` is what prevents that message from being printed.

### Part E — Creating the thread

```
Thread t1 = new Thread(task);
```

Here, we create a `Thread` object and give it the `Runnable` task.

Remember the distinction:

- `Runnable` defines the work.
- `Thread` provides the execution thread.

At this point, `t1` is in the `NEW` state because it hasn't started yet.

### Part F — Starting the worker

```
t1.start();
```

This starts a new thread of execution. The JVM arranges for the worker to execute the task's `run()` method.

The worker prints `"Worker started"` and enters `Thread.sleep(5000)`.

Meanwhile, the main thread continues independently.

### Part G — Making the main thread sleep

```
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return;
}
```

This sleep occurs inside `main()`, so it pauses the main thread, not the worker.

We use one second here to give the worker time to start sleeping before we interrupt it.

The catch block handles the possibility that the main thread itself gets interrupted. Restoring its interrupt status and returning allows `main()` to exit cleanly.

### Part H — Interrupting the worker

```
t1.interrupt();
```

After the main thread's one-second sleep completes, it calls `interrupt()` on `t1`.

Since the worker is sleeping, the following happens:

1. The worker's sleep is interrupted.
2. `Thread.sleep(5000)` throws `InterruptedException`.
3. Execution moves to the worker's `catch` block.
4. The worker restores its interrupt status.
5. `return` exits the task.
6. `"Worker finished"` is never printed.

## 4. Understand the complete execution flow

Main thread

Creates the worker and calls `t1.start()`.

Worker thread

Prints `"Worker started"` and sleeps for 5 seconds.

Meanwhile, the main thread sleeps for 1 second.

Main thread calls `t1.interrupt()`

Worker catches `InterruptedException`

Restores interrupt status and executes `return`.

Worker terminates

`"Worker finished"` is skipped.

## 5. Why don't we use `t1.stop()` instead?

Java has a method called `Thread.stop()`, but it is deprecated and unsafe. It can terminate a thread while it is modifying shared data, potentially leaving the application in an inconsistent state.

Instead, Java programs generally use cooperative interruption:

- One thread calls `interrupt()`.
- The target thread detects or receives the interruption.
- The target thread handles it and decides how to exit safely.

## 6. What happens if we remove `return`?

Consider this version:

```
catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}

System.out.println("Worker finished");
```

The output would generally be:

```
Worker started
Worker finished
```

Why? Catching the exception does not automatically exit the method. Once the catch block finishes, execution continues to the next statement.

That's why we added `return` in our corrected version.

## 7. Important concepts to remember

| Concept                              | Meaning                                                   |
| ------------------------------------ | --------------------------------------------------------- |
| `Runnable`                           | Defines the task to execute.                              |
| `Thread.sleep(5000)`                 | Pauses the current thread for approximately five seconds. |
| `Thread.sleep(1000)`                 | Pauses the main thread here for approximately one second. |
| `t1.interrupt()`                     | Requests interruption of worker thread `t1`.              |
| `InterruptedException`               | Exception thrown when a sleeping thread is interrupted.   |
| `Thread.currentThread().interrupt()` | Restores the current thread's interrupt status.           |
| `return`                             | Exits the current task immediately.                       |

One-line understanding: The main thread interrupts the sleeping worker after approximately one second, the worker handles `InterruptedException`, restores its interrupt status, and exits without printing `"Worker finished"`.
