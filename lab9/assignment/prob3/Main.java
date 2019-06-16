package assignment.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abbc");// okay
        list.add("abcd");
        list.add("abbbb");
        list.add("abbc"); // okay
        list.add("acdcb");
        list.add("bbdcc");
        list.add("adc");

        System.out.println(new Main().countWords(list,'a','d',4));
    }

    public int countWords(List<String> words, char c, char d, int len) {

        return (int) words.stream().filter(s -> s.length() == len).filter(s -> {
            if (!s.contains(String.valueOf(c))) {
                return false;
            }
            if (s.contains(String.valueOf(d))) {
                return false;
            }
            return true;
        }).count();


    }


}

