## Item 18: Favor composition over inheritance

Inheritance is powerful, but it is problematic because it violates encapsulation.
It is appropriate only when a genuine subtype relationship exists between the subclass and the superclass.
Even then, inheritance may lead to fragility if the subclass is in a different package from the superclass
and the superclass is not designed for inheritance. To avoid this fragility, use composition and forwarding
instead of inheritance, especially if an appropriate interface to implement a wrapper class exists.
Not only are wrapper classes more robust than subclasses, they are also more powerful.
