package assignment.Day2.prob4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
//      Arrays.sort(names, (x,y)-> x.compareTo(y));
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));
    }
}
