package behavior.template_method.after;

public abstract class Payment {

    protected float amount;
    protected Gateway gateway;

    public Payment(float amount, Gateway gateway) {
        this.amount = amount;
        this.gateway = gateway;
    }

    // Hook
    public float calculateTax() {
        return 0f;
    }

    public abstract float calculateDiscount();

    // Template Method
    public boolean charge() {
        float value = this.amount + calculateTax() - calculateDiscount();
        return gateway.charge(value);
    }

}
