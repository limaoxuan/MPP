package assignment.Day2.prob2;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        Supplier<Double> expression1 = ()->Math.random();
        // i.
        Supplier<Double> expression = Math::random;

        System.out.println(expression.get());

        // ii.
        Supplier<Double> expression1 = () -> Math.random();
        System.out.println(expression1.get());

        // iii.
        MySupier mySupier = new Main().new MySupier();
        System.out.println(mySupier.get());

    }

     class MySupier implements Supplier {
        /**
         * Gets a result.
         *
         * @return a result
         */
        @Override
        public Object get() {
            return Math.random();
        }
    }
}
