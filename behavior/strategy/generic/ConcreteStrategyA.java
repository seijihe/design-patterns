package behavior.strategy.generic;

public class ConcreteStrategyA implements Strategy{

    @Override
    public void execute() {
        IO.print("Concrete Strategy A");
    }
    
}
