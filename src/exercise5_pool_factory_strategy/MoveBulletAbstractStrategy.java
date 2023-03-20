package exercise5_pool_factory_strategy;

public abstract class MoveBulletAbstractStrategy implements MoveBulletStrategy {

    private int vectY;
    private int vectX;

    private ParentAlive parentAlive;

    public MoveBulletAbstractStrategy(int vectY, int vectX, ParentAlive parentAlive) {
        this.vectY = vectY;
        this.vectX = vectX;
        this.parentAlive = parentAlive;
    }

    public int getVectY() {
        return vectY;
    }

    public void setVectY(int vectY) {
        this.vectY = vectY;
    }

    public int getVectX() {
        return vectX;
    }

    public void setVectX(int vectX) {
        this.vectX = vectX;
    }

    public ParentAlive getParentAlive() {
        return parentAlive;
    }

    public void setParentAlive(ParentAlive parentAlive) {
        this.parentAlive = parentAlive;
    }

    public boolean isAlive() {
        return parentAlive.isAlive();
    }
}
