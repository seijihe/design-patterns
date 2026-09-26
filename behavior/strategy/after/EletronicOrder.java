package behavior.strategy.after;

public class EletronicOrder extends Order{

    // Subclass Specific Members representation
    private String modality;
    public EletronicOrder(float amount, Shipping shipping) {
        super(amount, shipping);
        this.modality = "Furniture";
    }
    
}
