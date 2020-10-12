## Item 10: Obey the general contract when overriding `equals`

The `equals` method must be:
- Reflexive (x = x)
- Symmetric (x = y -> y = x)
- Transitive (x = y and y = z -> x = z)
- Consistent 
    (multiple invocations of x.equals(y) must consistently return `true` or `false` for any non-null reference value x and y)
- For non null x, `x.equals(null)` should return false

