package assignment.prob3.duck;


import assignment.prob3.quack.QuackEnum;

public class RubberDuck extends Duck {
    public RubberDuck() {

    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public QuackEnum getQuackEnum() {
        return QuackEnum.Squeak;
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
