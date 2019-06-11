package assignment.prob3.duck;


import assignment.prob3.quack.QuackEnum;

public class MallardDuck extends Duck {
    public MallardDuck() {

    }

    @Override
    public boolean isFly() {
        return true;
    }

    @Override
    public QuackEnum getQuackEnum() {
        return QuackEnum.QUACK;
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
