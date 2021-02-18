# Item 49: Check parameters for validity

Each time you write a method or constructor, you should think about what restrictions exist on its parameters.
You should document these restrictions and enforce them with explicit checks at the beginning of the method body.
It is important to get into the habit of doing this. The modest work that it entails will be paid back
with interest the first time a validity check fails.

## Examples

```java
/*
 * Returns a BigInteger whose value is (this mod m). This method
 * differs from the remainder method in that it always returns a
 * non-negative BigInteger.
 * 
 * @param m the modulus, which must be positive
 * @return this mod m
 * @throws ArithmeticException if m is less than or equal to 0
 */
public BigInteger mod(BigInteger m) {
    if (m.signum() <= 0)
        throw new ArithmeticException("Modulus <= 0:" + m);
    ... // Do the computation
}
```

```java
// Inline use of Java's null-checking facility
this.strategy = Objects.requireNonNull(strategy, "strategy");
```

```java
// Private helper function for a recursive sort
private static void sort(long a[], int offset, int length) {
    assert a != null;    
    assert offset >= 0 && offset <= a.length;
    assert length >= 0 && length <= a.length - offset;
    ... // Do the computation
}
```
