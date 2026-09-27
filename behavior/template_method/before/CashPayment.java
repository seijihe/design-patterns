package behavior.template_method.before;

public class CashPayment {

    private float amount;
    private Gateway gateway;

    public CashPayment(float amount, Gateway gateway) {
        this.amount = amount;
        this.gateway = gateway;
    }

    private float calculateTax() {
        return 0;
    }

    private float calculateDiscount() {
        return this.amount * 0.1f;
    }

    public boolean charge() {
        float value = this.amount + calculateTax() - calculateDiscount();
        return gateway.charge(value);
    }
    
}
