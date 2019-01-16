package java8.shengsiyuan;

import java.util.function.Predicate;

public class PerdicateTest {
    public static void main(String[] args) {
        Predicate<String> perdicate = p -> p.length() > 5;
        System.out.println(perdicate.test("hello"));

    }
}