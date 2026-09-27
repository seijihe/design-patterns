package behavior.template_method.after;

public class CashPayment extends Payment{

    public CashPayment(float amount, Gateway gateway) {
        super(amount, gateway);
    }

    // Hook (Already implemented at Superclass)
    // @Override
    // public float calculateTax() {
    //     return 0;
    // }

    @Override
    public float calculateDiscount() {
        return this.amount * 0.1f;
    }
    
}
