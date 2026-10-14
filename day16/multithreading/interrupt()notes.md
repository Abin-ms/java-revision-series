## Definition of `interrupt()` in Java

`interrupt()` is a method of the `Thread` class that requests a thread to interrupt its current activity. It does not forcibly terminate the thread; the effect depends on what the thread is doing and how its code handles the interruption.

### Syntax

```
t1.interrupt();
```

Here, `t1` is the thread we want to interrupt.

## What does `interrupt()` do?

Its behavior depends on the target thread's current activity.

1. If the thread is sleeping or waiting: It can throw an `InterruptedException` and clear the thread's interrupt status.
2. If the thread is running ordinary code: It sets the thread's interrupt status to `true`. The thread must check this status or otherwise respond to the interruption request.
3. If the thread has already terminated: Calling `interrupt()` has no effect on its execution.

## Example

```
Thread t1 = new Thread(() -> {
    try {
        System.out.println("Worker started");
        Thread.sleep(5000);
        System.out.println("Worker finished");
    } catch (InterruptedException e) {
        System.out.println("Worker interrupted");
    }
});

t1.start();

Thread.sleep(1000);
t1.interrupt();
```

Possible output:

```
Worker started
Worker interrupted
```

The worker begins sleeping for five seconds. After approximately one second, the main thread calls `t1.interrupt()`. Because the worker is sleeping, it receives an `InterruptedException` and executes the `catch` block.

Notice that `"Worker finished"` is not printed because the exception transfers execution to the `catch` block.

### Important distinction

| Method                 | Purpose                                                                            |
| ---------------------- | ---------------------------------------------------------------------------------- |
| `t1.interrupt()`       | Requests interruption of thread `t1`.                                              |
| `t1.isInterrupted()`   | Checks whether `t1`'s interrupt status is set.                                     |
| `Thread.interrupted()` | Checks the current thread's interrupt status and clears it when it returns `true`. |

Remember this for interviews: `interrupt()` is a cooperative interruption mechanism, not a forceful thread-termination method.
