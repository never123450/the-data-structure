package design.structure.adapter.classdapter;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("ConcreteTarget方法");
    }
}