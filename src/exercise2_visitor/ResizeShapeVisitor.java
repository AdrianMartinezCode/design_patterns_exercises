package exercise2_visitor;

public class ResizeShapeVisitor implements ShapeVisitor {

    private int resizeFactor;

    public ResizeShapeVisitor(int resizeFactor) {
        this.resizeFactor = resizeFactor;
    }

    @Override
    public void visit(CircleShape circleShape) {
        circleShape.setRadius(circleShape.getRadius()*resizeFactor);
    }

    @Override
    public void visit(SquareShape squareShape) {
        squareShape.setLength((int)(squareShape.getLength()*resizeFactor));
    }

    @Override
    public void visit(Document document) {
        // do nothing, the document shouldn't be resized
    }
}
