package exercise2_visitor;

public class SquareShape extends AbstractShape implements Shape {

    private int length;

    public SquareShape(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
