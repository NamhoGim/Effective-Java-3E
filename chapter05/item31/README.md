# Item 31: Use bounded wildcards to increase API flexibility

Using wildcard types while tricky,makes the APIs far more flexible.
If you write a library that will be widely used, the proper use of wildcard types should be considered mandatory.
Remember the basic rule: producer-extends, consumer-super (PECS).
Also remember that all comparables and comparators are consumers.