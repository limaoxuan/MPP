package lesson8.assignment.Day1.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class HomeWorkOne {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> exp = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };
    }
}
