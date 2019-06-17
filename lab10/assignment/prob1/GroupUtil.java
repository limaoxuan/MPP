package assignment.prob1;

import java.util.*;

public class GroupUtil {
    //Fix this code
    public static Group<?> copy(Group<?> group) {
        return copyHelp(group);
    }

    public static <T> Group<T> copyHelp(Group<T> group) {
        Group<T> grp = new Group<>(group.getSpecialElement(), group.getElements());
        return grp;
    }

    //Test using this main method
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
        Group<Integer> group = new Group<>(0, list);
        System.out.println(group);
        System.out.println(GroupUtil.copy(group));
    }
}
