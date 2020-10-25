## Item 15: Minimize the accessibility of classes and members

The rule of thumb is simple: make each class of member as inaccessible as possible

- **private**: The member is accessible only from the top-level class where it is declared.

- **package-private**: The member is accessible from any class in the package where it is declared.
                       Technically known as *default* access, this is the access level you get
                       if no access modifier specified (except for interface members, which are public by default).
                       
- **protected**: The member is accessible from subclasses of the class where it is declared and from any class in the package
                 where it is declared.                    

- **public**: The member is accessible from anywhere.
