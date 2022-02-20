## Item 14: Consider implementing `Comparable`

If you are writing a value class with an obvious natural ordering, such as alphabetical order, numerical order,
or chronological order, you should implement the Comparable interface:

    public interface Comaprable<T> {
      int compareTo(T t);
    }

The general contract of the `compareTo` method is similar to that of `equals`:

Compare this object with the specified object for order. Returns a negative integer, zero, or positive integer
as this object is less than, equal to, or greater than the specified object.
Throws `ClassCastException` if the specified object's type prevents it from being compared to this object.

- The implementor must ensure that `sgn(x.compareTo(y) == -sgn(y.compareTo(x))`
  for all `x` and `y`. (This implies that `x.compareTo(y)` must throw an exception
  if and only if `compareTo(x)` throws an exception.)

- The implementor must also ensure that the relation is transitive:
  (`x.compareTo(y)` > 0 && `y.compareTo(z)` > 0) implies `x.compareTo(z)` > 0.

- Finally, the implementor must ensure that `x.compareTo(y) == 0` implies that 
  `sgn(x.compareTo(z)) == sgn(y.compareTo(z))`, for all `z`.

- It is strongly recommended, but not required, that `(x.compareTo(y) == 0) == (x.equals(y))`
  If it's not, it has to be documented that the natural ordering of this class is inconsistent with equals.

In summary, whenever you implement a value class that has a sensible ordering,
you should have the class implement the `Comparable` interface so that its instance can be easily sorted, searched,
and used in comparison-based collections. When comparing field values in the implementations of the `compareTo` methods,
avoid the use of the > and < operators. Instead, use the static `compare` method in the boxed primitive classes
or the comparator construction methods in the `Comparator` interface.