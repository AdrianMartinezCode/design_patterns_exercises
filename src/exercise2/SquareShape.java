package exercise2;

public class SquareShape extends AbstractShape implements Shape {

    private int length;

    @Override
    public void drawShape(PaintPanel paintPanel) {
        for (int i = 0; i < length; i++) {
            paintPanel.drawPoint(x + i - length/2, y - length/2);
            paintPanel.drawPoint(x - length/2, y + i - length/2);
            paintPanel.drawPoint(x + i - length/2, y + length/2);
            paintPanel.drawPoint(x + length/2, y + i - length/2);
        }
    }

    @Override
    public void resizeShape(double ratio) {
        length = (int)(length*ratio);
    }
}
