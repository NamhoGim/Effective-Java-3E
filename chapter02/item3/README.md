## Item 3: Enforce the singleton property with a private constructor or an enum type

Two common ways yo implement singletons.
Both are based on keeping the constructor private and exporting a public static member to provide access to the sole instance.

1. The member is a final field:

```java
// Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() { ... }

    public void leaveTheBuilding() { ... }
}
```

  - Main advantage of public field approach
    1. API makes it clear that the class is a singleton: the public static is final,
        so it will always contain the same object reference.
    2. It's simple.
        

2. The public member is a static factory method:

```java
// Singleton with static factory
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() { ... }
    public static Elvis getInstance() { return INSTANCE; }
    
    public void leaveTheBuilding() { ... }
}
```

  - Advantages:
    1. It gives you the flexibility to change your mind about whether the class is a singleton without changing its API.
    2. You can write a _generic singleton factory_ if your application requires it.
    3. Using a static factory is that a _method reference_ can be used as supplier, for example `Elvis::instance`
        is a `Supplier<Elvis>`.
