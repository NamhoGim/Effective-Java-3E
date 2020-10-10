# Item 20: Prefer interfaces to abstract classes

An interface is generally the best way to define a type that permits multiple implementations.
It you export a nontrivial interface, you should strongly consider providing a skeletal implementation
via default methods on the interface so that all implementors of the interface can make use of it.
That said, restrictions on interfaces typically mandate that a skeletal implementation take the form of an abstract class.
