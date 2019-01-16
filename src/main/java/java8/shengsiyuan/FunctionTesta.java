package java8.shengsiyuan;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTesta {

    public static void main(String[] args) {

        FunctionTesta testa = new FunctionTesta();

//        System.out.println(testa.compute(2,value->value*3,value->value*value));//12
//        System.out.println(testa.compute2(2,value->value*3,value->value*value));//36

//        System.out.println(testa.compute3(1,2,(value1,value2) -> value1+value2));
//        System.out.println(testa.compute3(1,2,(value1,value2) -> value1-value2));
//        System.out.println(testa.compute3(1,2,(value1,value2) -> value1*value2));
//        System.out.println(testa.compute3(1,2,(value1,value2) -> value1/value2));

        System.out.println(testa.compute4(2,3,(value1,value2)->value1+value2,value ->value*value));

    }

    public int compute(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b, BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(a,b);
    }

    public int compute4(int a,int b,BiFunction<Integer,Integer,Integer> biFunction,Function<Integer,Integer> function){
        return biFunction.andThen(function).apply(a,b);
    }
}