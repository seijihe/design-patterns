## Strategy Pattern

### What does it do?
Defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the client: changing one member of the family does not impact the client, and changing the client does not affect the strategy implementations.

### When do we use it?

- Variations of the same algorithm
- Avoid exposing sensitive algorithm implementation details
- Remove conditional statements that determine algorithm behavior based on different objects or cases

### Consequences

- The client must know which Strategy classes are available.
  - Before: calls a method like `calculateStrategyA` or uses a value like `strategyA`, and a conditional decides which algorithm to execute.
  - Now: provides a Strategy implementation, such as `ConcreteStrategyA`.

