package assignment.prob3.quack;

public interface QuackBehavior {
    QuackEnum getQuackEnum();

    default void quack() {

        switch (getQuackEnum()) {
            case QUACK:
                System.out.println("quacking");
                break;
            case Squeak:
                System.out.println("squeaking");
                break;
            case MUTEQUACK:
                System.out.println("cannot quack");
                break;

        }


    }

    ;
}
