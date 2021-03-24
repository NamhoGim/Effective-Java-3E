# Item 76: Strive for failure atomicity

- Generally speaking, a failed method invocation should leave the object in the state that it was in prior to the 
  invocation. A method with this property is said to be _failure-atomic_.
  
- There are several ways to achieve this effects:
  1. Design immutable objects(Item 17).
  2. Check parameters for validity before performing the operations (Item 49).
  3. Perform the operation on a temporary copy of the object and replace the contents of the object with the 
     temporary copy once the operations is complete.
  4. To write the _recovery code_ that intercepts a failure that occurs in the midst of an operation, and cause the 
     object to roll back its state to the point before the operation began. This approach is use mainly for durable 
     (disk-based) data structures.   
     
- As a rule, any generated exception that is part of a method's specification should leave the object in the same 
  state it was in prior to the method invocation. WHere this rule is violated, the API documentation should  clearly 
  indicate what state the object will be left in. Unfortunately, plenty of existing API documentation fails to live 
  up to this ideal.
  
