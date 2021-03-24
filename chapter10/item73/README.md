# Item 73: Throw exceptions appropriate to the abstraction

Higher layers should catch lower-level exceptions and, in their place, throw exceptions that can be explainer in 
terms of the higher-level abstraction. This idiom is known as _exception translation_.

```java
// Exception Translation
try {
    ... // Use lower-level abstraction to do our bidding    
} catch (LowerLevelException e) {
    throw new HightLevelException(...);    
}
```

```java
/**
* Returns the element at the specified position in this list. 
* @throws IndexOutOfBoundsException if the index is out of range 
*           ({@code index < 0 || index >= size()}).
*/
   public E get(int index) {
       ListIterator<E> i = listIterator(index);
       try {
           return i.next();
       } catch (NoSuchElementException e) {
           throw new IndexOutOfBoundsException("Index: " + index);
       }
}
```

A special form of exception translation called _exception chaining_ is called for is cases where the lower-level 
exception might be helpful to someone debugging the problem that cause the higher-level exception. The lower-level 
exception (the cause) is passed to the higher-level exception, which provides an accessor method (`Throwable`'s 
`getCause` method) to retrieve the lower-level exception:

```java
// Exception Chaining
try {
    ... // Use lower-level abstraction to do our bidding
    } catch (LowerLevelException cause) {
    throw new HigherLevelException(cause);
}
```

The higher-level exception’s constructor passes the cause to a chaining-aware superclass constructor,
so it is ultimately passed to one of Throwable’s _chaining-aware_ constructors, such as Throwable(Throwable):

```java
// Exception with chaining-aware constructor
class HigherLevelException extends Exception {
    HigherLevelException(Throwable cause) {
        super(cause);
    }
}
```

If is isn't feasible to prevent or to handle exceptions from lower layers, use exception translation, unless the 
lower-level method happens to guarantee that all of its exceptions are appropriate to the higher level. Chaining 
provides the best of both worlds: it allows you to throw an appropriate higher-level exception, while capturing the 
underlying cause for failure analysis(Item 75).
