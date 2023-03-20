package exercise5_pool_factory_strategy;

public abstract class EnemyShip {

    private int x;
    private int y;
    private int currentLifePoints;

    private MoveBulletFactory moveBulletFactory;

    public EnemyShip(int x, int y, MoveBulletFactory moveBulletFactory) {
        this.x = x;
        this.y = y;
        this.currentLifePoints = getLifePoints();
        this.moveBulletFactory = moveBulletFactory;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCurrentLifePoints() {
        return currentLifePoints;
    }

    public void setCurrentLifePoints(int currentLifePoints) {
        this.currentLifePoints = currentLifePoints;
    }

    public boolean isAlive() {
        return currentLifePoints > 0;
    }

    public void resetLifePoints() {
        this.currentLifePoints = getLifePoints();
    }

    public void setMoveBulletFactory(MoveBulletFactory moveBulletFactory) {
        this.moveBulletFactory = moveBulletFactory;
    }

    public MoveBulletFactory getMoveBulletFactory() {
        return moveBulletFactory;
    }

    public abstract int getLifePoints();

    public abstract Bullet fire(BulletObjectPool bulletObjectPool);
}
