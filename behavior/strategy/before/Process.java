package behavior.strategy.before;

public class Process {
    void main() {
        Order order01 = new EletronicOrder(100.00f);
        Float shipping01 = order01.calculateExpressShipping();
        Order order02 = new FurnitureOrder(100.00f);
        Float shipping02 = order02.calculateExpressShipping();
    }
}
