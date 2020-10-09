# Item 7: Eliminate obsolete object reference

Memory leaks can happen in:

- A class that managed its own memory
- Caching objects
- The use of listeners and callback

In those three cases, the programmer needs to think about nulling object references that are known to be obsolete

**Example**:

```java
public Object pop() {
    if (size == 0) {
        throw new EmptyStackException();
    }
    Object result = elements[--size];
    elements[size] = null;
    return result;
}
```