package assignment.prob3.duck;


import assignment.prob3.fly.FlyBehavior;
import assignment.prob3.quack.QuackBehavior;
import assignment.prob3.quack.QuackEnum;

public abstract class Duck implements FlyBehavior, QuackBehavior {

//    QuackEnum quackEnum =
    public abstract void display();

    public void swim() {
        System.out.println("swimming");
    }


}
