package exercise5_pool_factory_strategy;

public class Bullet implements ParentAlive {

    private int x;
    private int y;

    private int damage;

    private boolean alive;

    private MoveBulletStrategy moveBulletStrategy;

    public Bullet(int x, int y, int damage/*, MoveBulletStrategy moveBulletStrategy*/) {
        this.x = x;
        this.y = y;
        this.damage = damage;
        this.alive = true;
        //this.moveBulletStrategy = moveBulletStrategy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setCollides() {
        this.alive = false;
    }

    public void restart() {
        this.alive = true;
    }

    public MoveBulletStrategy getMoveBulletStrategy() {
        return moveBulletStrategy;
    }



    public void setMoveBulletStrategy(MoveBulletStrategy moveBulletStrategy) {
        this.moveBulletStrategy = moveBulletStrategy;
    }
}
