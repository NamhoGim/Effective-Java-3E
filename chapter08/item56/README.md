# Item 56: Write doc comments for all exposed API elements

- To document your API properly, you must precede _every_ exported class, interface, constructor, method, and field 
declaration with a doc comment.
- The doc comment for a method should describe succinctly the contract between the method and its client.
- Doc comments should be readable both in the source code and in the generated documentation.
- To avoid confusion, no two members or constructors in a class or interface should have the same summary description.
- When documenting a generic type or method, be sure to document all type parameters.
- When documenting an enum type, be sure to document the constants as well as the type and any public methods.
- When documenting an annotation type, be sure to document any members as well as the type itself.
- Two aspects of APIs that are often neglected in documentation are thread-safety and serializability.
  Whether or not a class or static method is thread-safe, you should document its thread-safety level, as described 
  in Item 82.

Documentation comments are the best, most effective way to document your API. Their use should be considered 
mandatory for all exported API elements. Adopt a consistent style that adheres yo standard conventions.
Remember that arbitrary HTML is permissible in documentation comments and that HTML metacharacters must be escaped.
