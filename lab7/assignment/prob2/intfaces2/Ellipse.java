package assignment.prob2.intfaces2;

public class Ellipse implements ClosedCurve{
    private double semiMajor;
    private double semiMinor;

    public Ellipse(double semiMajor, double semiMinor) {
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }



    @Override
    public double computePerimeter() {
        return 2 * Math.PI * semiMinor + 4 * (semiMajor - semiMinor);
    }
}
