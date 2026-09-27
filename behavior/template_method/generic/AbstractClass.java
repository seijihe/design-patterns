package behavior.template_method.generic;

public abstract class AbstractClass {
    
    public void templateMethod() {
        step01();
        step02();
    }

    public abstract void step01();
    public abstract void step02();
}
