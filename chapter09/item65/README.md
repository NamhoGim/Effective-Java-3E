# Item 65: Prefer interfaces to reflection

Reflection allows one class to use another, even if the latter class did not exist when the former was compiled.
This power, however comes at a price.

* You lose all the benefits of compile-time type checking.
* The code required to perform reflective access is clumsy and verbose.
* Performance suffers.

You can obtain many of the benefits of reflection while incurring few of its costs by using it only in a very 
limited form.

Create instances reflectively and access them normally via their interface or superclass.

Reflection is a powerful facility that is required for certain sophisticated system programming tasks, but it has 
many disadvantages, If you are writing a program that has to work with classes unknown at compile time, you should, 
if at all possible, use reflection only to instantiate objects, and access the object using some interface or 
superclass that is known at compile time.
