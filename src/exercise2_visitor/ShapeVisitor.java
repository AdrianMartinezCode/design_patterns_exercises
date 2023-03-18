package exercise2_visitor;


public interface ShapeVisitor {
    void visit(CircleShape circleShape);
    void visit(SquareShape squareShape);
    void visit(Document document);
}
