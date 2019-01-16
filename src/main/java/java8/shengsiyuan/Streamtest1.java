package java8.shengsiyuan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamtest1 {
    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello","world","hello world");

        String[] myArray = new String[]{"hello","world","hello world"};

        //转换为Stream的三种方式
        Stream stream2 = Stream.of(myArray);
        Stream stream3 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();



    }
}