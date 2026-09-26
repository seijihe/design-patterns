package behavior.strategy.after;

public class Process {
    Order order01 = new EletronicOrder(
        100.00f, new ExpressShipping());
    Float shipping01 = order01.calculateShipping();
    
    Order order02 = new FurnitureOrder(
        100.00f, new StardardShipping());
    Float shipping02 = order01.calculateShipping();
}
