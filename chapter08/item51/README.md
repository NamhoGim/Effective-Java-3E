# Item 51: Design method signatures carefully

1. Choose method names carefully
    - Names should always obey the standard naming conventions(Item 68)
    - Primary goal should be to choose names that are understandable and consistent with other names in the same package.
    - Secondary goal should be to choose names consistent with the broader consensus, where it exists.

2. Don't go overboard in providing convenience methods.
    - Too many methodsmake a class difficult to learn, use, document, test, and maintain.
    - For each action supported by your class or interface, provide a fully functional method.

3. Avoid long parameter lists.
    - Aim for four parameters or fewer.
    - Long sequences of identically typed parameters are especially harmful.
    - Three techniques for shortening overly long parameter lists.
      1. Break the method up into multiple methods, each of which required only a subset of the parameters.
      2. Create _helper classes_ to hold groups of parameters.
      3. Combines aspects of the first two is to adapt the Builder pattern (Item 2) from object construction
         to method invocation.
         
4. For parameter types, favor interfaces over classes (Item 64).    
    - If there is an appropriate interface to define a parameter, use it in favor of a class that implements the interface.

5. Prefer two-element enum type to `boolean` parameters, unless the meaning of the boolean is clear from the method name.         
         
           
              
           
  


  

