package behavior.strategy.before;

public abstract class Order {

    private float amount;

    public Order(float amount) {
        this.amount = amount;
    }

    // Getter and Setter

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    // Applying shipping tax

    public abstract float calculateStandardShipping();
    
    public abstract float calculateExpressShipping();
}
