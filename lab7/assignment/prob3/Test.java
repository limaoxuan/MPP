package assignment.prob3;

import assignment.prob3.duck.*;


public class Test {
    public static void main(String[] args) {
        Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};

        for (Duck d : ducks) {
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
            System.out.println();
        }
    }
}
