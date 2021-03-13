# Item 68: Adhere to generally accepted naming conventions

The following table shows examples of typographical conventions.

| **Identifier Type** | **Examples** |
|---------------------|--------------|
| Package or module | `org.junit.jupiter.api`, `com.google.common.collect` |
| Class or Interface | `Stream`, `FutureTask`, `LinkedHashMap`, `HttpClient` |
| Method or Field | `remove`, `groupingBy`, `getCrc` |
| Constance Field | `MIN_VALUE`, `NEGATIVE_INFINITY` |
| Local Variable | `i`, `denom`, `houseNum` |
| Type Parameter | `T`, `E`, `K`, `V`, `X`, `R`, `U`, `V`, `T1`, `T2` |

Type parameter names usually consist of a single letter. Most commonly it is one of these five:
`T` for an arbitrary type, `E` for the element type of a collection, `K` and `V` for the key and value types of a map,
and `X` for an exception. The return type of a function is usually `R`. A sequence of arbitrary types can be `T`, `U`
`V` or `T1`, `T2`, `T3`.

A few method names deserve special mention. Instance methods that convert the type of an object, returning an 
independent object of a different type, are often called `toType`, for example, `toString` or `toArray`.
Methods that return a _view_ (Item 6) whose type differs from that of the receiving object are often called `asType`,
for example, `asList`. Method that return a primitive with the same value as the object on which they're invoked are 
often called `typeValue`, for example, `intValue`. Common names for static factories include `from`, `of`, `valueOf`,
`instance`, `getInstance`, `newInstance`, `getType`, and `newType` (Item 1, page 9).

Internalize the standard naming conventions and learn to use them as second nature. The typographical conventions 
are straightforward and largely unambiguous; the grammatical conventions are more complex and looser.
To quote from _The Java Language Specification_, "These conventions should not be followed slavishly if long-held 
conventional usage dictates otherwise". Use common  sense.
