package assignment.prob5;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Section {
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        // Implement the code
        if (m > n) {
           throw new IllegalArgumentException("m must equals or less than n");
        }
        Stream<String> limit = stream.skip(m).limit(n - m + 1);
        return limit;
    }

    public static void main(String[] args) {
        // Make three calls for the streamSection() method with different inputs
        // use nextStream() method to supply the Stream input as a first argument in streamSection() method
        streamSection(nextStream(),1,2).forEach(System.out::println);
        streamSection(nextStream(),11,222).forEach(System.out::println);
        streamSection(nextStream(),5,12).forEach(System.out::println);
    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }
}
