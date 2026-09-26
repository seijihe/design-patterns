package behavior.strategy.after;

public class FurnitureOrder extends Order{

    // Subclass Specific Members representation
    private String modality;
    public FurnitureOrder(float amount, Shipping shipping) {
        super(amount, shipping);
        this.modality = "Eletronics";
    }

}
