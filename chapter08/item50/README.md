# Item 50: Make defensive copies when needed

If a class has mutable components that it gets from or returns to its clients, 
the class must defensively copy these components. If the cost of the copy would be prohibitive
and the class trusts its clients not to modify the components inappropriately,
then the defensive copy may be replaced by documentation outlining the client's
responsibility not to modify the affected components. 
