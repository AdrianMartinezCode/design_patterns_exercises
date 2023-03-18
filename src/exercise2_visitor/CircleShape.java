package exercise2_visitor;

public class CircleShape extends AbstractShape implements Shape {

    static double PI = 3.1415926535;

    private double radius;


    public CircleShape(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
