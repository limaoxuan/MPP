package assignment.prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//    summary
        Stream<Integer> myIntStream = Stream.of(234, 454, 3434);
        IntSummaryStatistics collect = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
    }
}
