## Item 11: Always override `hashCode` when you override `equals`

- hashCode needs to be consistent
- if `a.equals(b)` is true then `a.hashCode() == b.hashCode()`
- if `a.equals(b)` is false then `hashCode()` doesn't have to be different of b.hashCode()