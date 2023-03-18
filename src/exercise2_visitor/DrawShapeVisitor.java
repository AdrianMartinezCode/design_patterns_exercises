package exercise2_visitor;


public class DrawShapeVisitor implements ShapeVisitor {

    private PaintPanel paintPanel;

    @Override
    public void visit(CircleShape circleShape) {
        for (int i = 0; i < 360; i += 1) {
            int angle = i;
            double x1 = circleShape.getRadius() * Math.cos(angle * CircleShape.getPI() / 180);
            double y1 = circleShape.getRadius() * Math.sin(angle * CircleShape.getPI() / 180);
            paintPanel.drawPoint((int)x1 + circleShape.getX(), (int)y1 + circleShape.getY());
        }
    }

    @Override
    public void visit(SquareShape squareShape) {
        int x = squareShape.x;
        int y = squareShape.y;
        int length = squareShape.getLength();
        for (int i = 0; i < length; i++) {
            paintPanel.drawPoint(x + i - length/2, y - length/2);
            paintPanel.drawPoint(x - length/2, y + i - length/2);
            paintPanel.drawPoint(x + i - length/2, y + length/2);
            paintPanel.drawPoint(x + length/2, y + i - length/2);
        }
    }

    @Override
    public void visit(Document document) {
        // draw points to make blank the foreground of the panel
        // TODO make 200x600 (DIN A4) as the Document properties
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 600; j++) {
                paintPanel.drawPoint(i, j);
            }
        }
    }
}
