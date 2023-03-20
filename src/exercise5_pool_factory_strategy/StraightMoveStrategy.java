package exercise5_pool_factory_strategy;

public class StraightMoveStrategy extends MoveBulletAbstractStrategy {

    public StraightMoveStrategy(int vectY, int vectX, ParentAlive parentAlive) {
        super(vectY, vectX, parentAlive);
    }

    @Override
    public void moveBullet(Bullet bullet) {
        bullet.setX(getVectX()*bullet.getX());
        bullet.setY(getVectY()*bullet.getY());
    }

    @Override
    public void expireStrategy() {
        // Should do nothing
    }
}
