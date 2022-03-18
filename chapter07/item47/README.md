## Item 47: Prefer Collection to Stream as a return type

When writing a method that returns a sequence of elements,
remember that some of your users may want to process them as a stream while others may want to iterate over them.
Try to accommodate both groups. If it’s feasible to return a collection, do so.
If you already have the elements in a collection or the number of elements in the sequence is small enough to justify creating a new one,
return a standard collection such as ArrayList.
Otherwise, consider implementing a custom collection as we did for the power set.
If it isn’t feasible to return a collection, return a stream or iterable, whichever seems more natural.
If, in a future Java release, the Stream interface declaration is modified to extend Iterable,
then you should feel free to return streams because they will allow for both stream processing and iteration.
