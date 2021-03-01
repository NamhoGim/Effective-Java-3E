# Item 64: Refer to objects by their interfaces

If appropriate interface types exist, then parameters, return values, variables, and fields should all be declared 
using interface types.

To make this concrete, consider the case of `LinkedHashSet`, which is am implementation of the `Set` interface.

```java
// Good - uses interface as type
Set<Son> sonSet = new LinkedHashSet<>();

// Bad - uses class as type!
LinkedHashSet<Son> sonSet = new LinkedHashSet<>();
```

It is entirely appropriate to refer to an object by a class rather than an interface if no appropriate interface exists.

If there is no appropriate interface, just use the least specific class in the class hierarchy that provides the 
required functionality.
