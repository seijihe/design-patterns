## Template method

### What is it?
- Template Method: The Template Method pattern defines the general structure of an algorithm in a superclass, while allowing subclasses to customize specific steps without changing the overall flow.
- Take what is common in the code and move it to the superclass, while keeping what is specific in the subclasses. This is OOP through inheritance. The pattern here is to take the steps that will be overridden by subclasses and include them in a method that acts as the template for the execution flow.
- In this structure, there is a form of dependency inversion because the subclass does not contain the concrete implementation of the template method, so it calls the superclass implementation. However, during execution, the superclass does not contain the concrete implementation of the specific steps, so it calls the implementations provided by the subclasses (ocurring the Dependency Inversion).
- Hook: A hook is an optional method in a Template Method that has a default implementation, often empty, which subclasses can override when they need to customize part of the algorithm.