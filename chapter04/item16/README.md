## Item 16: In public classes, use accessor methods, not public fields

Public classes should never expose mutable fields.
It is less harmful, though still questionable, for public classes to expose immutable fields.
It is, however, sometimes desirable for package-private or private nested classes to expose fields, whether mutable or immutable.
