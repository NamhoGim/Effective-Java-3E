## Item 34: Use enums instead of int constants

The advantages of enum types over `int` constants are compelling. Enums are more readable, safer, and more powerful.
May enums require no explicit constructors or members, but others benefit from associating data with each constant
and providing method whose behavior is affected by this data. Fewer enums benefit from associating multiple behaviors
with a single method. In this relatively rare case, prefer constant specific methods to enums that switch on their own values.
Consider the strategy enum pattern if some, but not all, enum constants share common behaviors.
