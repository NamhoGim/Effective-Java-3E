## Item 19: Design and document for inheritance or else prohibit it

Designing a class for inheritance is hard work. You must document all of its self-use patterns,
and once you've documented them, you must commit to them for the life of the class.
If you fail to do this, subclasses may become dependent on implementation details of the superclass
and may break if the implementation of the superclass changes. To allow others to write _efficient_ subclasses,
you may also have yo export one or more protected methods. Unless you know there is a real need for subclasses,
you are probably better off prohibiting inheritance by declaring your class final and or ensuring that there are no accessible constructors.
