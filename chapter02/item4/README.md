## Item 4: Enforce noninstantiability with a private constructor

_Utility classes_ were not designed to be instantiated: an instance would be nonsensical.
In the absence of explicit constructors, however, the compiler provides a public, parameterless _default constructor_.
To a user, this constructor is indistinguishable from any other. It is not uncommon to see unintentionally instantiable classes in published APIs.
Attempting to enforce noninstantiability by making a class abstract does not work.
The class can be subclassed and the subclass instantiated. Furthermore, it misleads the user into thinking the class was designed for inheritance (Item 19).
There is, however, a simple idiom to ensure noninstantiability. A default construc- tor is generated only if a class contains no explicit constructors,
so a class can be made noninstantiable by including a private constructor:

```java
// Noninstantiable utility class
public class UtilityClass {
   // Suppress default constructor for noninstantiability
   private UtilityClass() {
       throw new AssertionError();
   }
   ...  // Remainder omitted
}
```

As a side effect, this idiom also prevents the class from being subclassed.
All constructors must invoke a superclass constructor, explicitly or implicitly,
and a subclass would have no accessible superclass constructor to invoke.
