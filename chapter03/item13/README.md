## Item 13: Override `clone` judiciously

The `Cloneable` interface determines the behavior of `Object`'s protected `clone` implementation:
if a class implements `Cloneable`, `Object`'s `clone` method returns a field-by-field copy of the object;
otherwise it throws `CloneNotSupportedException`.

The general contract for the clone method is weak. Here it is, copied from the Object specification :
> Creates and returns a copy of this object. The precise meaning of “copy” may depend on the class of the object.
> The general intent is that, for any object x, the expression
> 
>     x.clone() != x
> 
> will be true, and the expression
> 
>     x.clone().getClass() == x.getClass()
> 
> will be true, but these are not absolute requirements. While it is typically the case that
> 
>     x.clone().equals(x)
> 
> will be true, this is not an absolute requirement.
> 
> By convention, the object returned by this method should be obtained by calling super.clone.
> If a class and all of its superclasses (except Object) obey this convention, it will be the case that
> 
>     x.clone().getClass() == x.getClass().
> 
> By convention, the returned object should be independent of the object being cloned.
> To achieve this independence, it may be necessary to modify one or more fields of the object returned by `super.clone`
> before returning it.

Given all the problems associated with `Cloneable`, new interfaces should not extend it,
and new extendable classes should not implement it. While it's less harmful for final classes to implement `Cloneable`,
this should be viewed as a performance optimization, reserved for the rare cases where it is justified (Item 67).
As a rule, copy functionality is best provided by constructors or factories. A notable exception to this rule is arrays,
which are best copied with the clone method.