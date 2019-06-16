package assignment.prob7.prob7b;

import lesson9.lambdalibrary.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> SALARY_AND_LASTNAME  =
            (list, salary, cha) -> list.stream().filter(x -> x.salary > salary).filter(x -> {
                int ch = x.getLastName().charAt(0);
                if (ch > cha) {
                    return true;
                }
                return false;
            }
    ).map(x -> x.getFirstName() + " " + x.getLastName()).sorted().collect(Collectors.joining(", "));



}
