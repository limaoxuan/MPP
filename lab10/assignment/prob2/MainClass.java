package assignment.prob2;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        int secondSmallest = secondSmallest(Arrays.asList(10, 30, 40, 80));
        System.out.println(secondSmallest);
    }

    public static <T extends Comparable<? super T>> T secondSmallest(List<? extends T> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("size must large than 1");
        }
        list.sort((a, b) -> a.compareTo(b));
        return list.get(1);
    }
}
