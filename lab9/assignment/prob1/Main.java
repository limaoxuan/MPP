package assignment.prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        joining
        Stream<String > stringStream = Stream.of("Bill","Thomas","Mary");
        System.out.println( stringStream.collect(Collectors.joining(",")));
    }
}
