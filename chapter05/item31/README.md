## Item 31: Use bounded wildcards to increase API flexibility

- For maximum flexibility, use wildcard types on input parameters that represent producers or consumers.
> PECS stands for producer-extends, consumer-super
- Do not use bounded wildcard types as return types. Rather than providing additional flexibility for your users,
  it would force them to use wildcard types in clint code.
- If a type parameter appears only once in a method declaration, replace it with a wildcard.
  If it's an unbounded type parameter, replace it with an unbounded wildcard; if it's a bounded type parameter,
  replace it with a bounded wildcard.

Using wildcard types while tricky,makes the APIs far more flexible.
If you write a library that will be widely used, the proper use of wildcard types should be considered mandatory.
Remember the basic rule: producer-extends, consumer-super (PECS).
Also remember that all comparable and comparators are consumers.
