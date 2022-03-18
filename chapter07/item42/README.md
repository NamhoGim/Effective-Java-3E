## Item 42: Prefer lambdas to anonymous classes

In Java 8, the language formalized the notion that interface with a single abstract method are special and deserve special treatment.
These interfaces are now known as _functional interfaces_, and the language allows you to create instances of these interfaces using _lambda expressions_,
or lambda for short.

- Sort a list of strings in order of length, using an anonymous class to create the sort's comparison function (which impose the sort order):

```java
Collections.sort(words, new Comparator<String>() {
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
});
```

- Anonymous class replaced by a lambda. The boilerplate is gone, and the behavior is clearly evident:

```java
Collections.sort(words, 
        (s1, s2) -> Integer.compare(s1.length(), s2.length()));
```

- Incidentally, the comparator in the snippet can be made even more succinct if a _comparator construction method_ is used in place of a lambda.

```java
Collections.sort(words, comparingInt(String::length));
```

- The snippet can be made still shorter by taking advantage of the `sort` method that was added to the `List` interface in Java 8:

```java
words.sort(comparingInt(String::length));
```

As of Java 8, lambdas are by far the best way to represent small function objects.
Don't use anonymous classes for function objects unless you have to create instances of types that aren't functional interface.
Also, remember that lambdas make it so easy to represent small function objects that it opens the door to functional programming
techniques that were not previously practical in Java.
