package design.director.v2;

public class EaggDecorator extends AbstractDecorator {
    public EaggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋 ";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}