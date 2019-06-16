package assignment.prob9;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
                    new Dish("beef", false, 700, Dish.Type.MEAT),
                    new Dish("chicken", false, 400, Dish.Type.MEAT),
                    new Dish("french fries", true, 530, Dish.Type.OTHER),
                    new Dish("rice", true, 350, Dish.Type.OTHER),
                    new Dish("season fruit", true, 120, Dish.Type.OTHER),
                    new Dish("pizza", true, 550, Dish.Type.OTHER),
                    new Dish("prawns", false, 400, Dish.Type.FISH),
                    new Dish("salmon", false, 450, Dish.Type.FISH));

    public static void main(String[] args) {
//        a. Is there any Vegetarian meal available ( return type boolean)
        System.out.println(" a. Is there any Vegetarian meal available ( return type boolean)");
        boolean isVegetarianAvailable = menu.stream().anyMatch(Dish::isVegetarian);
        System.out.println(isVegetarianAvailable);

//        b. Is there any healthy menu have calories less than 1000 ( return type boolean)
        System.out.println(" b. Is there any healthy menu have calories less than 1000 ( return type boolean)");

        boolean b = menu.stream().anyMatch(x -> x.isVegetarian() && x.calories < 1000);
        System.out.println(b);

//        c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
        System.out.println(" c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)");

        boolean c = menu.stream().anyMatch(x -> !x.isVegetarian() && x.calories > 1000);
        System.out.println(c);

//        d. find and return the first item for the type of MEAT( return type Optional<Dish>)
        System.out.println(" d. find and return the first item for the type of MEAT( return type Optional<Dish>)");

        Optional<Dish> first = menu.stream().filter(x -> x.getType() == Type.MEAT).findFirst();
        System.out.println(first);
//        first.ifPresent(System.out::println);

//        e. calculateTotalCalories() in the menu using reduce. (return int)
        System.out.println(" e. calculateTotalCalories() in the menu using reduce. (return int)");
        Integer integer = calculateTotalCalories();
        System.out.println(integer);

//        Runnable calculateTotalCalories = Dish::calculateTotalCalories;

//        f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
        System.out.println("f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)");
        MyFunctional<Integer> myFunctional = Dish::calculateTotalCalories;
        Integer integer1 = myFunctional.test();
        System.out.println(integer1);

    }


    public static int calculateTotalCalories() {
        if (menu.stream().map(Dish::getCalories).reduce(Integer::sum).isPresent()) {
            return menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        }
        return 0;
    }
}