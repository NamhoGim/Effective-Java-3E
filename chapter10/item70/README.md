# Item 70: Use checked exceptions for recoverable conditions and runtime exceptions for programming errors

Java provides three kinds of throwables: _checked exceptions, runtime exceptions, and errors_.

* The cardinal rule in deciding whether to use a checked or an unchecked exception is this:
use checked exceptions for conditions from which the called can reasonably be expected to recover. By throwing a 
checked exception, you force the caller to handle the exception in a `catch` clause or to propagate it outward.
  
* Use runtime exceptions to indicate programming errors.

* All of the unchecked throwables you implement should subclass `RumtimeException`.

_Throw checked exceptions for recoverable conditions and unchecked exceptions for programming errors._ When in doubt, 
throw unchecked exceptions. Don't define any throwables that are neither checked exceptions nor runtime exceptions.
Provide methods on your checked exceptions to aid in recovery.
