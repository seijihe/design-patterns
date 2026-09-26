package behavior.strategy.generic;

public class ConcreteStrategyB implements Strategy {
    
    @Override
    public void execute() {
        IO.print("Concrete Strategy A");
    }

}
