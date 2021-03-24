# Item 74: Document all exceptions thrown by each method

- It is critically important that you take the time to carefully document all of the exception thrown by each method 
(Item 56).
  
- Always declare checked exception individually, and document precisely the conditions under which each one is thrown
using the Javadoc `@throws` tag.

- It is particularly important that methods in interfaces documents the unchecked exceptions they may throw. This 
  documentation forms a part of the interface's _general contact_ and enables common behavior among multiple 
  implementations of the interface.
  
- Use the Javadoc `@throws` tag to document each exception that a method can throw, but do _not_ use the `throws` 
  keyword on unchecked exceptions.
  
- If an exception is thrown by many methods in a class for the same reason, you can document the exception in the 
  class's documentation comment rather than documenting it individually for each method.
  
Document every exception that can be thrown by each method that you write. This is true for unchecked as well as 
checked exceptions, and for abstract as well as concrete methods. This documentation should take the form of 
`@throws` tags in doc comments. Declare each checked exception individually in a method's `throws` clause, but do 
not declare unchecked exceptions. If you fail to document the exceptions that your method can throw, it will be 
difficult or impossible for others to make effective use of your classes and interfaces.
