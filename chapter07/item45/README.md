## Item 45: Use streams judiciously

Overusing streams makes programs hard to read and maintain.

Stream make it very easy to do some things:

- _Uniformly transform_ sequences of elements
- _Filter sequences_ of elements
- _Combine sequences_ of elements using a single operation (for example to add them, concatenate them, or compute their minimum)
- _Accumulate sequences_ of elements into a collection, perhaps grouping them by some common attribute
- _Search a sequence_ of elements for an element satisfying some criterion

Some tasks are best accomplished with streams, and others with iteration.
Many tasks are best accomplished by combining the two approaches.
There are no hard and fast rules for choosing which approach to use for a task, but there are some useful heuristics.
In many cases, it will be clear which approach to use; in some cases, it won’t.
**If you’re not sure whether a task is better served by streams or iteration, try both and see which works better.**
