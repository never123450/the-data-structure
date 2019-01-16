package java8.shengsiyuan;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperationTest {
    public static void main(String[] args) {
        BinaryOperationTest binaryOperationTest = new BinaryOperationTest();

//        System.out.println(binaryOperationTest.compute(1,2,(a,b)->a+b));
//        System.out.println(binaryOperationTest.compute(1,2,(a,b)->a-b));


        System.out.println(binaryOperationTest.getSort("hello12","world",(a,b) -> a.toString().length() - b.toString().length()));
    }


    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator){
        return binaryOperator.apply(a,b);
    }

    public Object getSort(Object a, Object b, Comparator<Object> compute){
        return BinaryOperator.maxBy(compute).apply(a,b);
    }

}