package java8.shengsiyuan;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        if (optional.isPresent()){
            System.out.println(optional.get());
        }
        System.out.println("-------------");

        optional.ifPresent(item -> System.out.println(item));
        System.out.println("-------------");

        System.out.println(optional.orElse("world"));
        System.out.println("-------------");

        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}