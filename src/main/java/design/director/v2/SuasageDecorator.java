package design.director.v2;

public class SuasageDecorator extends AbstractDecorator{
    public SuasageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠 ";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}