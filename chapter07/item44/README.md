## Item 44: Favor the use of standard functional interfaces

The six basic standard functional interfaces:

- `Operator`: Represents a function whose result and argument types are the same.
- `Predicate`: Represents a function that takes an argument and returns a `boolean`.
- `Function`: Represents a function whose argument and return types differ.
- `Supplier`: Represents a function that takes no arguments and returns (or "supplies") a value.
- `Consumer`: Represents a function that takes an argument and returns nothing, essentially consuming its argument.

| **Interface**       | **Function Signature**  | **Example**           |
|---------------------|-------------------------|-----------------------|
| `UnaryOperator<T>`  | `T apply(T t)`          | `String::toLowerCase` |
| `BinaryOperator<T>` | `T apply(T t1, T t2)`   | `BigInteger::add`     |
| `Predicate<T>`      | `boolean test(T t)`     | `Collection::isEmpty` |
| `Function<T, R>`    | `R apply(T t)`          | `Arrays::asList`      |
| `Supplier<T>`       | `T get()`               | `Instant::now`        |
| `Consumer<T>`       | `void accept(T t)`      | `System.out.println`  |

Now that Java has lambdas, it is imperative that you design your APIs with lambdas in mind.
Accept functional interface types on input and return them on output. It is generally best to use the standard interfaces provided in
`java.util.function.Function`, but keep your eyes open for the relatively rare cases where you would be better off writing your functional interface.
