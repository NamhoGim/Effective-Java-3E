## Item 40: Consistently use the `Override` annotation

The compiler can protect you from a great many errors if you use the `Override` annotation on every method
declaration that you believe to override a super type declaration, with one exception. In concrete classes,
you need not annotate methods that you believe to override abstract method declarations(though it is not harmful to do so).
