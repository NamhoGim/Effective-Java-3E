## Item 6: Avoid creating unnecessary objects

It is often appropriate to reuse a single object instead of creating a new functionally equivalent object each time it is needed.
Reuse can be both faster and more stylish. An object can always be reused if it is immutable (Item 17).
In addition to reusing immutable objects, you can also reuse mutable objects if you know they won’t be modified.

