# Item 28: Prefer lists to arrays

Arrays differ from generic types in two important ways.
First, arrays are _covariant_. This scary-sounding word means simply that if `Sub` is
a subtype of `Super`, then the array type `Sub[]` is a subtype of array type `Super[]`.
Generics, by contrast are _invariant_: for any two distinct types `Type1` and `Type2`
, `List<Type1>` is neither a subtype nor a supertype of `List<Type2>`.

```java
// Fails at runtime!
Object[] objectArray = new Long[1];
objectArray[0] = "I don't fit in"; // Throws ArraysStoreException
```

```java
// Won't compile
List<Object> ol = new ArrayList<>(); // Incompatible types
ol.add("I don't fit in");
```

The second major difference between arrays and generics is that arrays are _reified_.
This means that arrays know and enforce their element type at runtime.
Generics, by contrast, are implemented by _erasure_. This means that they enforce
their type constraint only at compile time and discard (or erase) their element type
information at runtime. Erasure is what allowed generic types to interoperate freely
with legacy code that didn't use generics, ensuring a smooth transition to generics in Java 5.
Because of these fundamental differences, arrays and generics do not mix well.
For example, it is illegal to create an array of a generic type, a parameterized type,
or a type parameter.Therefore, none of these array creation expression are legal:
`new List<E>[]`, `new List<String>[]`, `new E[]`. All will result in _generic array creation_ errors at compile time.

In summary, arrays and generics have very different type rules.
Arrays are _covariant_ and _reified_; generics are _invariant_ and _erased_.
As a consequence, arrays provide runtime type safety but not compile-time type safety, and vice versa for generics.
As a rule, arrays and generics don’t mix well. If you find yourself mixing them and getting compile-time errors or warnings,
your first impulse should be to replace the arrays with lists.
