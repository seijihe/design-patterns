package behavior.template_method.after;

public class CreditPayment extends Payment {

    public CreditPayment(float amount, Gateway gateway) {
        super(amount, gateway);
    }

    @Override
    public float calculateTax() {
        return amount * 0.05f;
    }

    @Override
    public float calculateDiscount() {
        if (this.amount > 300)
            return this.amount * 0.02f;
        return 0;
    }

}
