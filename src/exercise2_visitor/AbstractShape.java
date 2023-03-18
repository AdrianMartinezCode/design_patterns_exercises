package exercise2_visitor;

public abstract class AbstractShape {

    protected int x;
    protected int y;

    public AbstractShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
