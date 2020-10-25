## Item 5: Prefer dependency injection to hardwiring resources

Do not use a singleton or static utility class to implement a class that depends on one or more underlying resources
whose behavior affects that of the class, and do not have the class create these resources directly.
Instead, pass the resources, or factories to create them, into the constructor (or static factory or builder).
This practice, known as dependency injection, will greatly enhance the flexibility, readability, and testability of a class.
