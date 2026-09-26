package behavior.strategy.after;

public class Order{

    private float amount;
    private Shipping shippingType;

    public Order(float amount, Shipping shipping) {
        this.amount = amount;
        this.shippingType = shipping;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setShippingType(Shipping shipping) {
        this.shippingType = shipping;
    }

    public float calculateShipping() {
        return this.shippingType.calculate(this.amount);
    }
}
