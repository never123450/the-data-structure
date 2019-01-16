package design.director.v1;

public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + "销售价格："+batterCake.cost());


        BatterCake batterCakeWithEag = new BatterCakeWithEag();
        System.out.println(batterCakeWithEag.getDesc() + "销售价格："+batterCakeWithEag.cost());



    }
}