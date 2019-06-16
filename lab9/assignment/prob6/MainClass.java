package assignment.prob6;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Set<String>> sets = new ArrayList<>();
        sets.add(new HashSet<>(Arrays.asList("A","B")));
        sets.add(new HashSet<>(Arrays.asList("D")));
        sets.add(new HashSet<>(Arrays.asList("1","2","3")));
        new MainClass().union(sets).stream().forEach(System.out::print);

    }

    public Set<String> union(List<Set<String>> sets) {

        return sets.stream().flatMap(x -> x.stream()).collect(Collectors.toSet());
    }
}
