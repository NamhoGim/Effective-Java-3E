# Item 61: Prefer primitive types to boxed primitives

There are three major differences between primitive and boxed primitives. First, primitives have only their values, 
whereas boxed primitives have identities distinct from their values. In other words, two boxed primitive instances 
can have same value and different identities. Second, primitive types have only fully functional values, whereas 
each boxed primitive type has one nonfunctional value, which is `null`, in addition to all the functional values of 
the corresponding primitive type. Last, primitives are more time- and space-efficient than boxed primitives.
All three of these differences can get you into real trouble if you aren't careful.

So When should you use boxed primitives? They have several legitimate uses. The first is as elements, keys, and 
values in collections. You can't put primitives in collections, so you're forced to use primitives. This is a 
special case of a more general one. You must use boxed primitives as type parameters in parameterized types and 
methods (Chapter 5), because the language does not permit you to use primitives. For example, you cannot declare a 
variable to be of type `TreadLocal<int>`, so you must use `ThreadLocal<Integer> instead. Finally, you must use boxed 
primitives when making reflective method invocations (Item 65).

Use primitives in preference to boxed primitives whenever you have the choice. Primitive types are simpler and faster.
If you must use boxed primitives, be careful! **Autoboxing reduces the verbosity, but not the danger, of using boxed 
primitives.** When your program compares two boxed primitives with the == operator, it does an identity comparison, 
which is almost certainly _not_ what you want. When your program dose mixed-type computations involving boxed and 
unboxed primitives, it does unboxing, and **when your program does unboxing, it can throw a `NullPointerException`.**
Finally, when your program boxes primitive values, it can result in costly and unnecessary object creations.
