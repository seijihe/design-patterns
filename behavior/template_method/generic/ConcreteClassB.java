package behavior.template_method.generic;

public class ConcreteClassB extends AbstractClass{
    
    @Override
    public void step01() {
        IO.print("ConcreteClassB Implementation step01");
    }

    @Override
    public void step02() {
        IO.print("ConcreteClassB Implementation step02");
    }

}
