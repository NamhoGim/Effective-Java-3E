# Item 12: Always override `toString`

Override Object’s toString implementation in every instantiable class you write,
unless a superclass has already done so. It makes classes much more pleasant to use and aids in debugging.
The toString method should return a concise, useful description of the object, in an aesthetically pleasing format.