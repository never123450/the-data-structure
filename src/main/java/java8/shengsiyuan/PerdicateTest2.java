package java8.shengsiyuan;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PerdicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PerdicateTest2 perdicateTest2 = new PerdicateTest2();

//        perdicateTest2.conditionFilter(list,item -> item%2==0);
//        System.out.println("-------------------");
//        perdicateTest2.conditionFilter(list,item -> item%2!=0);
//        System.out.println("-------------------");
//        perdicateTest2.conditionFilter(list,item -> item>5);
//        System.out.println("-------------------");

        perdicateTest2.conditionFilter2(list,item->item>5,item->item%2==0);

    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate){
        for(Integer integer : list){
            if (predicate.test(integer)){
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list,Predicate<Integer> predicate,
                                 Predicate<Integer> predicate2){
        for(Integer integer : list){
            if (predicate.and(predicate2).test(integer)){
                System.out.println(integer);
            }
        }
    }

}