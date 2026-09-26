package behavior.strategy.before;

public class EletronicOrder extends Order{

    // Subclass Specific Members representation
    private String modality;
    public EletronicOrder(float amount) {
        super(amount);
        this.modality = "Furniture";
    }

    @Override
    public float calculateStandardShipping() {
        return this.getAmount() * 0.05f;
    }
    @Override
    public float calculateExpressShipping() {
        return this.getAmount() * 0.1f;
    }
    
}
