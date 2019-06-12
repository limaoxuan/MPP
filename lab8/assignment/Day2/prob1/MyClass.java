package assignment.Day2.prob1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyClass {
    int x;
    int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean myMethod(MyClass cl) {
        Function<MyClass, Boolean> function = this::equals;
        return function.apply(cl);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(1, 2);
        MyClass myClass1 = new MyClass(1, 2);

        System.out.println( myClass.myMethod(myClass1));

        MyClass myClass2 = new MyClass(2, 2);

        System.out.println( myClass.myMethod(myClass2));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MyClass)) {
            return false;
        }

        MyClass myClass = (MyClass) obj;
        BiFunction<MyClass, MyClass, Boolean> emp = this::checkMyClass;
        return emp.apply(myClass, this);
    }

    private Boolean checkMyClass(MyClass x, MyClass y) {
        if (x.getX() != y.getX()) {
            return false;
        }
        if (x.getY() != y.getY()) {
            return false;
        }
        return true;
    }
}
