## Item 39: Prefer annotations to naming patterns

If you write a tool that requires programmers to add information to source code, define appropriate annotation types.
There is simply no reason to use naming patterns when you can use annotation instead.
That said, with the exception of toolsmith, most programmers will have no need to define annotation types.
But all programmers should use the predefined annotation types that Java provides (Item 40, 27).
Also, consider using the annotations provided by your IDE or static analysis tools.
Such annotations can improve the quality of the diagnostic information provided by these tools.
Note, however, that these annotations have yet to be standardized, so you may have some work to do if you switch tools
or if a standard emerges.
