# Item 59: Know and use the libraries

By using a standard library, you take advantage of the knowledge of the experts who wrote it and the experience of 
whose who used it before you.

Every programmer should be familiar with the basics of `java.lang`, `java.util`, and `java.io`, and their subpackages.

Don't reinvent the wheel. If you need to do something that seems like it should be reasonably common, there may 
already be a facility in the libraries that does what you want. If there is, use it; if you don't know, check.
Generally speaking, library code is likely to be better than code that you'd write yourself and is likely to improve 
over time. This is no reflection on your abilities as a programmer. Economies of scale dictate that library code 
receives far more attention than developers could afford to devote to the same functionality.
