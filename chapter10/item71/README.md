# Item 71: Avoid unnecessary use of checked exceptions

The additional burden on the programmer caused by a checked exception is substantially higher if it is the _sole_
checked exception thrown by a method.

The easiest way to eliminate a checked exception is to return an _optional_ of the desired result type (Item 55).
Instead of throwing a checked exception, the method simply returns an empty optional. The disadvantage of this 
technique is that the method can't return any additional information detailing its inability to perform the desired 
computation.

You can also turn a checked exception into an unchecked exception by breaking the method that throw the exception 
into two methods, the first of which returns a `boolean` indication whether the exception would be thrown.
This API refactoring transforms the calling sequence from this:

```java
// Invocation with checked exception
try {
    obj.action(args);    
} catch (TheCheckedException e) {
    ... // Handle exceptional condition
}
```

into this:

```java
// Invocation with state-testing method and unchecked exception
if (obj.actionPermitted(args)) {
    obj.action(args);    
} else {
    ... // Handle exceptional condition    
}
```

When used sparingly, checked exceptions can increase the reliability of programs; when overused, they make APIs 
painful to use. If callers won't be able to recover from failures, throw unchecked exceptions. If recovery may be 
possible and you want to _force_ callers to handle exceptional conditions, first consider returning an optional. 
Only if this would provide insufficient information in the case of failure should you throw a checked exception. 
