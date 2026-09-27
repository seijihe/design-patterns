package behavior.template_method.generic;

public class ConcreteClassA extends AbstractClass{

    @Override
    public void step01() {
        IO.print("ConcreteClassA Implementation step01");
    }

    @Override
    public void step02() {
        IO.print("ConcreteClassA Implementation step02");
    }
    
}
