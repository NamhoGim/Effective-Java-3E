# Item 72: Favor the use of standard exceptions

Reusing standard exceptions has several benefits. Chief among them is that it makes your API easier to learn and use 
because it matches the established conventions that programmers are already familiar with. A close second is that 
programs using your API are easier to read because they aren't cluttered with unfamiliar exceptions. Last (and least)
, fewer exception classes means a smaller memory footprint and less time spent loading classes.

Do _not_ reuse `Exception`, `RuntimeException`, `Throwable`, or `Error` directly. Threat these classes as if they 
were abstract. You can't reliably test for these exceptions because they are superclasses of other exceptions that a 
method may throw. This table summarize the most commonly reused exceptions:

| Exception | Occasion for Use |
|:----------|:-----------------|
| `IllegalArgumentException` | Non-null parameter value is inappropriate |
| `IllegalStateException` | Object state is inappropriate for method invocation |
| `NullPointerException` | Parameter value is null where prohibited |
| `IndexOutOfBoundsException` | Index parameter value if out of range |
| `ConcurrentModificationException` | Concurrent modifications of an object has been detected where it is prohibited |
| `UnsupportedOperationException` | Object does not support method |

Throw `IllegalStateException` if no argument values would have worked, otherwise throw IllegalArgumentException.
