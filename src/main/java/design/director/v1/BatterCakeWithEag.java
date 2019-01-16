package design.director.v1;

public class BatterCakeWithEag extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+4;
    }
}