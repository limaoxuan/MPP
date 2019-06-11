package assignment.prob2.intfaces2;

public class EquilateralTriangle implements Polygon {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double[] getSides() {
        return new double[]{side, side, side};
    }
}
