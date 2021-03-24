# Item 75: Include failure-capture information in detail messages

- It is critically important that the exception's `toString` method return as much information as possible  
  concerning the cause of the failure. In other words, the detail message of an exception should _capture the 
  failure_ for subsequent analysis.
  
- To capture a failure, the detail message of an exception should contain the values of all parameters and fields 
  that contributed to the exception.
  
- The detail message of an exception should not be confused with a user-level error message,
  which must be intelligible to end users. Unlike a user-level error message,
  the detail message is primarily for the benefit of programmers or site reliability engineers,
  when analyzing a failure. Therefore, information content is far more important than readability.
  User-level error messages are often localized, whereas exception detail messages rarely are.

- One way to ensure that exceptions contain adequate failure-capture information in their detail messages is
  to require this information in their constructors instead of a string detail message.
  
  ```java
  /**
   * Constructs an IndexOutOfBoundsException.
   *
   * @param lowerBound the lowest legal index value
   * @param upperBound the highest legal index value plus one
   * @param index      the actual index value
   */
  public IndexOutOfBoundsException(int lowerBound, int upperBound, int index) {
      // Generate a detail message that captures the failure
      super(String.format(
              "Lower bound: %d, Upper bound: %d, Index: %d",
              lowerBound, upperBound, index));

      // Save failure information for programmatic access
      this.lowerBound = lowerBound;
      this.upperBound = upperBound;
      this.index = index;
  }
  ```
  
- As suggested in Item 70, it may be appropriate for an exception to provide accessor methods for its failure-capture
  information (lowerBound, upperBound, and index in the above example). 
  It is more important to provide such accessor methods on checked exceptions than unchecked,
  because the failure-capture information could be useful in recovering from the failure.
  It is rare (although not inconceivable) that a programmer might want programmatic access to the details of an unchecked exception.
  Even for unchecked exceptions, however, it seems advisable to provide these accessors on general principle (Item 12, page 57).
