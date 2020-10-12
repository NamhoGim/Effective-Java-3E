## Item 23: Prefer class hierarchies to tagged classes

Tagged classes are seldom appropriate. If you're tempted to write a class
with an explicit tag field, think about whether the tage could be eliminated
and the class replaced by a hierarchy. When you encounter an existing class
with a tag field, consider refactoring it into a hierarchy.