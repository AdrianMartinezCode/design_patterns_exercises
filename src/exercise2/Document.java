package exercise2;

import java.util.List;

public class Document {

    private PaintPanel paintPanel;
    private List<Shape> shapes;


    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void draw() {
        shapes.forEach(s -> s.drawShape(paintPanel));
    }

    public void resizeShape(double factor, int ishape) {
        shapes.get(ishape).resizeShape(factor);
    }
}
