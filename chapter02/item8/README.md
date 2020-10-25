## Item 8: Avoid finalizer and cleaners

- Cleaners are less dangerous than finalizers, but still unpredictable,
    slow, and generally unnecessary.
- Never do anything time-critical in a finalizer or cleaner
- Never depend on a finalizer or cleaner to update persistent state.
- There is a _severe_ performance penalty for using finalizers and cleaners.
- Finalizers have a serious security problem: they open your class up to finalizer attacks.
- Throwing an exception from a constructor should be sufficient to prevent an object from coming into existence;
    in the presence of finalizers, it is not.
-  To protect nonfinal classes from finalizer attacks, write a final `finalize` method that does nothing.

Don't use cleaners, or in releases prior to Java 9, finalizers, except as a safety net or to terminate noncritical native resources.
Even then, beware the indeterminacy and performance consequences.
