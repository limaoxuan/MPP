package assignment.Day2.prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");

        // a.
        System.out.println("a");
        fruits.forEach(x-> System.out.println(x));
        // b.
        System.out.println("b");
        fruits.forEach(System.out::println);
    }
}
