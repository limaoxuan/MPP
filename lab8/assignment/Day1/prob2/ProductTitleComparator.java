package lesson8.assignment.Day1.prob2;

import java.util.Comparator;

public class ProductTitleComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.title.compareTo(o2.title);
    }
}
