
## 1. How your program executes

### Step 1: Start the worker thread

```
t1.start();
```

Java starts a new thread that executes the `task1` code.

The worker prints:

```
Worker started
```

Then it reaches:

```
Thread.sleep(2000);
```

The worker pauses for approximately 2 seconds.

### Step 2: Main calls `join()`

```
t1.join();
```

This is the key line, bro!

The `main` thread waits until `t1` terminates. It cannot move past this statement while `t1` is still running.

The execution looks like this:

### Worker thread

Print `Worker started`

Sleep for approximately 2 seconds

Print `Worker finished`

### Main thread

Call `t1.start()`

`t1.join()`

Main waits for the worker to finish

Print `Main finished`

### Step 3: Main continues

Once the worker finishes, `t1.join()` returns and the main thread continues:

```
System.out.println("Main finished");
```

That's why `Main finished` appears last.

## 2. `sleep()` vs `join()` — interview question

| `Thread.sleep()`                                   | `t1.join()`                                                         |
| -------------------------------------------------- | ------------------------------------------------------------------- |
| Pauses the current thread for a specified duration | Waits for the target thread to terminate                            |
| Takes milliseconds as an argument                  | Can be called without arguments to wait until completion            |
| Does not guarantee another thread has finished     | Guarantees the target has terminated when the call returns normally |
| Example: `Thread.sleep(2000)`                      | Example: `t1.join()`                                                |

Remember: `sleep()` is about waiting for time; `join()` is about waiting for a thread.

## 3. One small improvement to your code

You wrote:

```
try {
    t1.join();
} catch (Exception e) {
    Thread.currentThread().interrupt();
}
```

Your code works, but it's better to catch the specific exception:

```
try {
    t1.join();
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}
```

Why? `join()` can throw `InterruptedException`. Catching that specific exception makes your intention clearer. Restoring the interrupt status with `Thread.currentThread().interrupt()` is also a good practice.

One detail: if the main thread is interrupted while waiting, `join()` can return by throwing the exception before the worker has finished. In your normal run, no interruption occurred, so the output was correct.

# 🚀 Problem 12 — Two Threads with `join()`

Let's build on what you learned.

Create two threads:

- Worker A: prints `Worker A started`, sleeps for 2 seconds, then prints `Worker A finished`.
- Worker B: prints `Worker B started`, sleeps for 1 second, then prints `Worker B finished`.

In `main()`:

1. Start both threads.
2. Call `join()` on Worker A.
3. Call `join()` on Worker B.
4. Print `All workers finished`.

### Expected behavior

```
Worker A started
Worker B started
Worker B finished
Worker A finished
All workers finished
```

The first two messages can appear in either order, but `All workers finished` must print after both workers finish, assuming neither join is interrupted.

### Your challenge

Use the `Runnable` lambda approach you've already practiced. Handle `InterruptedException` properly, and send me your code when you're done, bro! 🔥
