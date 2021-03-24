# Item 77: Don't ignore exceptions

If you choose to ignore an exception, the `catch` block should contain a comment explaining why it is appropriate to 
do so, and the variable should be named ignored:

```java
Future<Integer> f = exec.submit(planarMap::chromaticNumber);
int numColors = 4; // Default; guaranteed sufficient for any map
try {
    numColors = f.get(1L, TimeUnit.SECONDS);
} catch (TimeoutException | ExecutionException ignored) {
    // Use default: minimal coloring is desirable, not required
}

```

Properly handling an exception can avert failure entirely. Merely letting an exception propagate outward can at 
least cause the program to fail swiftly, preserving information to aid in debugging the failure.
