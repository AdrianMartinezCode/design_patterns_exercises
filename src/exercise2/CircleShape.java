package exercise2;

public class CircleShape extends AbstractShape implements Shape {

    static double PI = 3.1415926535;

    private double radius;

    @Override
    public void drawShape(PaintPanel paintPanel) {
        for (int i = 0; i < 360; i += 1) {
            int angle = i;
            double x1 = radius * Math.cos(angle * PI / 180);
            double y1 = radius * Math.sin(angle * PI / 180);
            paintPanel.drawPoint((int)x1 + x, (int)y1 + y);
        }
    }

    @Override
    public void resizeShape(double ratio) {
        radius = radius*ratio;
    }
}
