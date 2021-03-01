# Item 63: Beware the performance of string concatenation

Using the string concatenation operator repeatedly to concatenate _n_ strings requires time quatratic in _n_.

```java
// Inappropriate use of string concatenation - Performs poorly!
public String statement() {
    String result = "";    
    for (int i = 0; i < numItems(); i++) {
        result += lineForItem(i);   // String concatenation        
    }
    return result;
}
```

To achieve acceptable performance, use a `StringBuilder` in place of a `String` to store the statement under 
construction:

```java
public String statemnt() {
    StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);    
    for (int i = 0; i < numItems(i); i++) {
        b.append(lineForItem(i));    
    }
    return b.toString();
}
```

The moral is simple: Don't use the string concatenation operator to combine more than a few strings unless 
performance is irrelevant. Use `StringBuilder`'s `append` method instead. Alternatively, use a character array, or 
process the strings one at a time instead of combining them.
