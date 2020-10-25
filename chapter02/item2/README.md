## Item 2: Consider a builder when faced with many constructor parameters

The builder pattern is a good choice when designing classes whose constructors or static factories would have more than
a handful of parameters, especially if many of the parameters are optional or identical type.
Client code is much easier to read and write with builders whan telescoping constructors, and builders are much safer than JavaBeans.
