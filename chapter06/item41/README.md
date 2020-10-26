## Item 41: Use marker interfaces to define types

A _marker interface_ is an interface that contains no method declarations but merely designates (or "marks") a class
that implements the interface as having some property. For example, consider the `Serializable` interface (Chapter 12).
By implementing this interface, a class indicates that its instances can be written to an `ObjectOutputStream` (or "serialized").

Marker interfaces have two advantages over marker annotations.
- Marker interface define a type that is implemented by instances of the marked class; marker annotations do not.
- Marker interface can be targeted more precisely.

The chief advantage of marker annotations over marker interface is that they are part of the larger annotation facility.

Marker interfaces and marker annotations both have their uses.
If you want yo define a type that does not have any new methods associated with it,
a marker interface is the way to go. If you want to mark program elements other than classes and interfaces
or  to fit the marker into a framework that already makes heavy use of annotation types, then a marker annotation is the correct choice.
If you find yourself writing a marker annotation type whose target is `ElementType.TYPE`,
take the time to figure out whether it really should be an annotation type or whether a marker interface would be more appropriate.
