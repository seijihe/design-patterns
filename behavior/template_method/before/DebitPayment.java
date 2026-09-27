package behavior.template_method.before;

public class DebitPayment {
    
    private float amount;
    private Gateway gateway;

    public DebitPayment(float amount, Gateway gateway) {
        this.amount = amount;
        this.gateway = gateway;
    }

    private float calculateTax() {
        return amount + 4.00f;
    }

    private float calculateDiscount() {
        return this.amount * 0.05f;
    }

    public boolean charge() {
        float value = this.amount + calculateTax() - calculateDiscount();
        return gateway.charge(value);
    }
}
