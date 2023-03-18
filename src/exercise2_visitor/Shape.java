package exercise2_visitor;

public interface Shape {
    void accept(ShapeVisitor shapeVisitor);
}
