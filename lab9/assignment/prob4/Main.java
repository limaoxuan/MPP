package assignment.prob4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquares(5);
    }

    public static void printSquares(int num) {
        IntStream.iterate(1, x -> x + 1).map(x -> x * x).limit(num).forEach(System.out::println);

    }

}
