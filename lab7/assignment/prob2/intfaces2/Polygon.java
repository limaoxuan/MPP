package assignment.prob2.intfaces2;

import java.util.Arrays;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter() {
        int sum = 0;
        for (double a : getSides()) {
            sum += a;
        }
        return sum;
    }
}
