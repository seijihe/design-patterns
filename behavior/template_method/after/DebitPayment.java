package behavior.template_method.after;

public class DebitPayment extends Payment {

    public DebitPayment(float amount, Gateway gateway) {
        super(amount, gateway);
    }

    @Override
    public float calculateTax() {
        return super.amount + 4.00f;
    }

    @Override
    public float calculateDiscount() {
        return this.amount * 0.05f;
    }

}
