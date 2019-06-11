package assignment.prob3.duck;


import assignment.prob3.quack.QuackEnum;

public class DecoyDuck extends Duck {

    public DecoyDuck() {

    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public QuackEnum getQuackEnum() {
        return QuackEnum.MUTEQUACK;
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }


}
