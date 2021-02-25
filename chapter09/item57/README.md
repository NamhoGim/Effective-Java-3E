# Item 57: Minimize the scope of local variables

- The most powerful technique for minimizing the scope of a local variable is to declare it where it is first used.
- Nearly every local variable declaration should contain an initializer.
- Prefer for loops to while loops.
- Keep methods small and focused.

```java
// Preferred idiom for iterating over a collection or array
for (Element e : c) {
    ... // Do Something with e    
}
```

```java
// Idiom for iterating when you need the iterator
for (Iterator<Element> i = c.iterator(); i.hasNext(); ) {
    Element e = i.next();
    ... // Do something with e and i
}
```

```java
// Another loop idiom that minimizes the scope of local variables
for (int i = 0; n = expensiveComputation(); i < n; i++) {
    ... // Do something with i;    
}
```
