package java8.shengsiyuan;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        FunctionTest test = new FunctionTest();
        //传递的是一种行为
        System.out.println(test.compute(1,value -> {return 2 * value;}));
        System.out.println(test.compute(2,value -> 5+value));
        System.out.println(test.compute(3,value -> value*value));

        System.out.println(test.convert(4, value -> String.valueOf(value+"Hello")));
    }

    public int compute(int a, Function<Integer ,Integer> function){
        int result = function.apply(a);
        return  result;
    }

    public String convert(int a,Function<Integer,String> fUnction){
        return fUnction.apply(a);
    }



}