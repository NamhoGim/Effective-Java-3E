## Item 33: Consider typesafe heterogeneous containers

The normal use of generics, exemplified by the collections APIs,
restricts you to a fixed number of type parameters per container.
You can get around this restriction by placing the type parameter
on the key rather than the container. You can use `Class` objects
as keys for such typesafe heterogeneous containers.
A `Class` object used in this fashion is called type token.
You can also use a custom key type. For example, you could have a `DatabaseRow` type
representing a database row (the container), and a generic type `Column<T>` as its key.
