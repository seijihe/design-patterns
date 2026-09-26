package behavior.strategy.after;

public class ExpressShipping implements Shipping{

    @Override
    public float calculate(float amount) {
        return amount * 0.1f;
    }
    
}
