package design.structure.adapter;

public class PowerAdapter implements DC5{

    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220();
        //变压器
        int adapteroutput = adapterInput/44;
        System.out.println("使用PowerAdapter输人AC：" + adapterInput + "V" + "输出DC：" + adapteroutput +"v");

        return adapteroutput;
    }
}