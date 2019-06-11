package assignment.prob3.fly;

public interface FlyBehavior {
//    void get
    boolean isFly();
    default void fly() {
        if (isFly()) {
            System.out.println("fly with wings");
        } else {
            System.out.println("cannot fly");
        }
    }
}
