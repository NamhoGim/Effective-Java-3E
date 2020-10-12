# Item 26: Don't use raw types

Using raw types can lead to exceptions at runtime,
so don't use them. They are provided only for compatibility and interoperability with legacy
code that predate the introduction of generics. As a quick review, `Set<Object>` is a parameterized type
representing a set that can contain only objects of some unknown type, and `Set` is a raw type,
which opts out of the generic type system. The first two are safe, and the last is not.

| **Term** | **Example** | **Item** |
|----------|-------------|----------|
| Parameterized type | `List<String>` | Item 26 |
| Actual type parameter | `String` | Item 26 |
| Generic type | `List<E>` | Item 26, 29 |
| Formal type parameter | `E` | Item 26 |
| Unbounded wildcard type | `List<?>` | Item 26 |
| Raw type | `List` | Item 26 |
| Bounded type parameter | `<E extends Number>` | Item 29 |
| Recursive type bound | `<T extends Comparable<T>>` | Item 30 |
| Bounded wildcard type | `List<? extends Number>` | Item 31 |
| Generic method | `static <E> List<E> asList(E[] a)` | Item 30 |
| Type token | `String.class` | Item 33 |