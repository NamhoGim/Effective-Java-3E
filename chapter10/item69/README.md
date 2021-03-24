# Item 69: Use exceptions only for exceptional conditions

```java
// Horrible abuse of exceptions. Don't ever do this!
try {
    int i = 0;    
    while (true) {
        range[i++].climb();    
    }
} catch (ArrayIndexOutOfBoundsException e) {
}
```

* Exceptions are, as their name implies, to be used only for exceptional conditions; they should never be used for 
  ordinary control flow.
  
* A well-designed API must not force its clients to use exceptions for ordinary control flow.

  ```java
  for (Iterator<Foo> i = collection.iterator(); i.hasNext(); ) {
      Foo foo = i.next();    
      ...
  }
  ```
  If `Iterator` lacked the `hasNext` method, clients would be forced to do this instead:
  ```java
  // Do not use this hideous code for iteration over collection!
  try {
      Iterator<Foo> i = collection.iterator();
      while(true) {
          Foo foo = i.next();        
          ...
      }
  } catch (NoSuchElementException e) {
  }
  ```

An alternative to providing a separate state-testing method is to have the state-dependent method return an empty 
optional (Item 55), or a distinguished value such as `null` if it cannot perform the desired computation.

Here are some guidelines to help you choose between a state-testing method and an optional or distinguished return 
value.

1. If an object is to be accessed concurrently without external synchronization or is subject to externally induced 
   state transitions, you must use an optional or distinguished return value, as the object's state could change in 
   the interval between the invocation of a state-testing method and its state-dependent method.
   
2. Performance concerns may dictate that an optional or distinguished return value be used if a separate 
   state-testing method would duplicate the work of the state-dependent method.
   
3. All other things being equal, a state-testing method is mildly preferable to a distinguished return value. It 
   offers slightly better readability, and incorrect use may be easier to detect: if you forget to call a 
   state-testing method, the state-dependent method will throw an exception, making the bug obvious;
  
In summary, exceptions are designed for exceptional conditions. Don't use them for ordinary control flow, and don't 
write APIs that force others to do so.
