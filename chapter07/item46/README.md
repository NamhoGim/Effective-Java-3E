## Item 46: Prefer side-effect-free functions in streams

The essence of programming stream pipelines is side-effect-free function objects.
This applies to all of the many function objects passed to streams and related objects.
The terminal operation `forEach` should only be used to report the result of a computation performed by a stream,
not to perform the computation. In order to use streams properly, you have to know about collectors.
The most important collector factories are `toList`, `toSet`, `toMap`, `groupingBy`, and `joining`.
