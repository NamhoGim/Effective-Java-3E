# Item 55: Return optionals judiciously

If you find yourself writting a method that can't always return a value and you believe it is important that user of 
the method consider this possibility every time they call it, then you should probably return an optional.
You should, however, be aware that there ar real performance consequences associated with returning optionals;
for performance-critical methods, it may be better to return a `null` or throw an exception. Finally, you should 
rarely use an optional in any other capacity than as a return value.
