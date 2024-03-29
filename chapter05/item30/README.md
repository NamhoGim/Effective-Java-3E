## Item 30: Favor generic methods

- Generic method
- Generic Singleton Factory Pattern
- Recursive type bound to express mutual comparability

Generic methods, like generic types, are safer and easier to use than methods requiring their clients
to put explicit cast on input parameters and return values. Like types, you should make sure that your method can be used
without casts, which often means making them generic. And like types, you should generify existing methods whose use require casts.
This makes life easier for new users without breaking existing client (Item 26).