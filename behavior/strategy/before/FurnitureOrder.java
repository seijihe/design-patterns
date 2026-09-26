package behavior.strategy.before;

public class FurnitureOrder extends Order{
    
    // Subclass Specific Members representation
    private String modality;
    public FurnitureOrder(float amount) {
        super(amount);
        this.modality = "Furniture";
    }

    @Override
    public float calculateStandardShipping() {
        return this.getAmount() * 0.05f;
    }
    @Override
    public float calculateExpressShipping() {
        throw new IllegalStateException("Unavailable type of shipping for this departament");
    }

}
