package design.director.v2;

public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake ;
        aBatterCake = new BatterCake();
        aBatterCake = new EaggDecorator(aBatterCake);
        aBatterCake = new EaggDecorator(aBatterCake);
        aBatterCake = new SuasageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + "销售价格："+aBatterCake.cost());
    }
}