package exercise2_visitor;

import java.util.List;

public class Document implements Shape {
    private List<Shape> shapes;


    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapes.forEach(s -> s.accept(shapeVisitor));
        shapeVisitor.visit(this);
    }
}
