package lesson8.assignment.Day1.prob2;

import lesson8.lambda.comparator2.EmployeeSalaryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {

    enum SortMethod {BYTITLE, BYPRICE}


    final String title;
    final double price;
    final int model;

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getModel() {
        return model;
    }

    public Product(String title, Double price, int model) {
        this.title = title;
        this.price = price;
        this.model = model;
    }

    public static void sort(List<Product> list, SortMethod sortMethod) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                if (sortMethod == SortMethod.BYPRICE) {
                    if (o1.price == o2.price) return 0;
                    else if (o1.price < o2.price) return -1;
                    else return 1;
                } else {
                    return o1.title.compareTo(o2.title);
                }
            }
        }
        Collections.sort(list, new ProductComparator());
    }

    public static void sortUsingLambdas(List<Product> list, SortMethod sortMethod) {
        Collections.sort(list,(Product o1, Product o2 )-> {
            if (sortMethod == SortMethod.BYPRICE) {
                if (o1.price == o2.price) return 0;
                else if (o1.price < o2.price) return -1;
                else return 1;
            }
            return o1.title.compareTo(o2.title);
        });
    }

    @Override
    public String toString() {
        return String.format("\n %s : %s : %s", title, price, model);
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Joe", 888.8, 111));
        products.add(new Product("andy", 222.2, 123));
        products.add(new Product("csa", 333.3, 123));

        // a
        System.out.println("A");
        Collections.sort(products, new ProductPriceComparator());
        System.out.println(products);

        // b
        System.out.println("B");
        Collections.sort(products, new ProductTitleComparator());
        System.out.println(products);

        // c
        System.out.println("C");
        sort(products, SortMethod.BYPRICE);
        System.out.println(products);

        sort(products, SortMethod.BYTITLE);
        System.out.println(products);

        // d
        System.out.println("D");
        sortUsingLambdas(products, SortMethod.BYPRICE);
        System.out.println(products);

        sortUsingLambdas(products, SortMethod.BYTITLE);
        System.out.println(products);


    }


}
