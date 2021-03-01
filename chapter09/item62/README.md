# Item 62: Avoid strings where other types are more appropriate

* Strings are poor substitutes for other value types.
* Strings are poor substitutes for enum types.
* Strings are poor substitutes for aggregate types.
  
  ```java
  // Inappropriate use of string as aggregate type
  String compoundKey = className + "#" + i.next();
  ```
  
* Strings are poor substitutes for capabilities.

  ```java
  // Broken - inappropriate use of string as capability!
  public class ThreadLocal {
    private ThreadLocal() { } // Noninstantiable
    
    // Sets the current thread's value for the named variable.
    public static void set(String key, Object value);
  
    // Returns the current thread's value for the named variable.
    public static Object get(String key);
  }
  ```
  
  * This API can be fixed by replacing the string with an unforgeable key(sometimes called a _capability_)
  
  ```java
  public class ThreadLocal {
    private ThreadLocal() { } // Noninstantiable
    
    public static class key { // (Capability)
      Key() { }  
    }
  
    // Generates a unique, unforgeable key
    public static Key getKey() {
      return new Key();
    }
  
    public static void set(Key key, Object value);
    public static Object get(Key key);
  } 
  ```
  
  * The key is no longer a key for a thread-local variable: is _is_ a thread-local variable.  
  
  ```java
  public final class ThreadLocal {
    public ThreadLocal();
    public void set(Object value);
    public Object get();
  }
  ``` 
  
  * It is simple matter to make this API typesafe by making `ThreadLocal` a parameterized class (Item 29):
  
  ```java
  public final class ThreadLocal<T> {
    public ThreadLocal();
    public void set(T value);
    public T get();
  }
  ```

Avoid the natural tendency to represent objects as strings when better data types exist or can be written. Used 
inappropriately, strings are more cumbersome, less flexible, slower, and more error-prone than other types. Types 
for which strings are commonly misused include primitive types, enums, and aggregate types.
