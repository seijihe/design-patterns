package behavior.strategy.after;

public class StardardShipping implements Shipping{

    @Override
    public float calculate(float amount) {
        return amount * 0.05f;
    }

}
