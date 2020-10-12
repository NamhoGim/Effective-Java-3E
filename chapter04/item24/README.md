## Item 24: Favor static member classes over nonstatic

There are four kinds of nested classes:
*static member classes*, *nonstatic member class*, *anonymous classes*, and *local classes*

If a nested class needs to be visible outside of a single method or is too long to fit comfortably inside a method,
use a member class. If each instance of a member class needs a reference to its enclosing instance, make nonstatic;
otherwise, make it static. Assuming the class belongs inside a method, if you need to create instances from one location
and there is preexisting type that characterizes the class, make it an anonymous class; otherwise, make it a local class.
