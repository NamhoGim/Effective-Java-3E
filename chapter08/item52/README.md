# Item 52: Use overloading judiciously

- Avoid confusing uses of overloading
- A safe, conservative policy is never to export two overloadings with the same number of parameters.
- You can always give methods different names instead of overloading them. 
- Do not overload methods to take different functional interfaces in the same argument position.

Just because you can overload methods doesn't mean you should. It is generally best to refrain from overloading 
methods with multiple signatures that have the same number of parameters. In some cases, especially where the 
constructors are involved, it may be impossible to follow this advice.
In these cases, you should at least avoid situations where the same set of parameters can be passed to different 
overloadings by the addition of casts. If this cannot be avoided, for example, because you are retrofitting an 
existing class to implement a new interface, you should ensure that all overloadings behave identically when passed 
the same parameters. If you fail to do this, programmers will be hard-pressed to make effective use of the 
overloaded method or constructor, and they won't understand why it doesn't work.
