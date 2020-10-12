## Item 14: Consider implementing `Comparable`

- The implementor must ensure that `sgn(x.compareTo(y) == -sgn(y.compareTo(x))`
  for all `x` and `y`. (This implies that `x.compareTo(y)` must throw an exception
  if and only if `compareTo(x)` throws an exception.)
- The implementor must also ensure that the relation is transitive:
  (`x.compareTo(y)` > 0 && `y.compareTo(z)` > 0) implies `x.compareTo(z)` > 0.
- Finally, the implementor must ensure that `x.compareTo(y) == 0` implies that 
  `sgn(x.compareTo(z)) == sgn(y.compareTo(z))`, for all `z`.
- It is strongly recommended, but not required, that `(x.compareTo(y) == 0) == (x.equals(y))`
  If it's not, it has to be documented that the natural ordering of this class is inconsistent with equals.

When confronted to different types of Object, compareTo can throw `ClassCastException`.
