package exercise2_visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Document d = new Document();
        d.addShape(new SquareShape(1, 1, 1));
        d.addShape(new CircleShape(2, 3, 5.0));

        d.accept(new ResizeShapeVisitor(5));
        d.accept(new DrawShapeVisitor());
    }
}
