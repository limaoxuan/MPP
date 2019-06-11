package assignment.prob3.duck;


import assignment.prob3.quack.QuackEnum;

public class RedheadDuck extends Duck{
    public RedheadDuck() {

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
