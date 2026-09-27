package behavior.template_method.before;

public class CreditPayment {
    
    private float amount;
    private Gateway gateway;

    public CreditPayment(float amount, Gateway gateway) {
        this.amount = amount;
        this.gateway = gateway;
    }

    private float calculateTax() {
        return amount * 0.05f;
    }

    private float calculateDiscount() {
        if (this.amount > 300)
            return this.amount * 0.02f;
        return 0;
    }

    public boolean charge() {
        float value = this.amount + calculateTax() - calculateDiscount();
        return gateway.charge(value);
    }

}
