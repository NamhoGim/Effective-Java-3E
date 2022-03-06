## Item 32: Combine generics and varargs judiciously

- It is unsafe to store a value in a generic varargs array parameter.
- It is unsafe to give another method access to a generic varargs parameter array,
  with two exceptions: it is safe to pass the array to another varargs method that is correctly annotated with `@SafeVarags`,
  and it is safe to pass to a non-varargs method that merely computes some function of the contents of the array.
- Use `@SafeVarargs` on every method with a varargs parameter of a generic or parameterized type,
  so its users won't be burdened by needless and confusing compiler warnings.
- A generic varargs methods is safe if:
  1. It doesn't store anything in the varargs parameter array, and
  2. It doesn't make the array (or a clone) visible to untrusted code.

Varargs and generics do not interact well because the varargs facility is a leaky abstraction built atop arrays,
and arrays have different type rules from generics. Though generic varargs parameters are not typesafe, they are legal.
If you choose to write a method with a generic (or parameterized) varargs parameter,
first ensure that the method is typesafe, and then annotate it with `@SafeVarargs` so it is not unpleasant to use.