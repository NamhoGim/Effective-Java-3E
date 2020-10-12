# Item 27: Eliminate unchecked warning

- Eliminate every unchecked warning that you can.

```java
Set<Lark> exaltation = new HashSet();
```    
resolve warning using the _diamond operator_ (<>)
```java
Set<Lark> exaltation = new HashSet<>();
```

- If you can't eliminate a warning, but you can prove that the code that
provoked the warning is typesafe, than (and only then) suppress the warning
with an `@SuppressWarnings("unchecked")` annotation.

- Always use the `SuppressWarnings` annotation on the smallest scope possible.
- Every time you use a `@SuppressWarnings("unchecked")` annotation, add a comment
saying why it is safe to do so.

For example, consider this `toArray` method, which comes from `ArrayList`:

```java
public <T> T[] toArray(T[] a) {
    if (a.length < size)
        return (T[]) Arrays.copyOf(elements, size, a.getClass());
    System.arraycopy(elements, 0, a, 0, size);
    if (a.length > size)
        a[size] = null;
    return a;
}
```

```java
// Adding local variable to reduce scope of @SuppressWarnings
public <T> T[] toArray(T[] a) {
    if (a.length < size) {
        // This cast is correct because the array we're creating
        // is of the same type as the one passed in, which is T[].
        @SuppressWarnings("unchecked") T[] result =
            (T[]) Arrays.copyOf(elements, size, a.getClass());
        return result;
    }
    System.out.arraycopy(elements, 0, a, 0, size);
    if (a.length > size)
        a[size] = null;
    return a;
}
```
