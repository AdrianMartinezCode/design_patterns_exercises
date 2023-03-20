package exercise5_pool_factory_strategy;

public class GigaEnemyShip extends EnemyShip {

    private static final int ORDINARY_ENEMY_SHIP_LIFEPOINTS = 100;

    public GigaEnemyShip(int x, int y, MoveBulletFactory moveBulletFactory) {
        super(x, y, moveBulletFactory);
    }


    @Override
    public int getLifePoints() {
        return ORDINARY_ENEMY_SHIP_LIFEPOINTS;
    }

    @Override
    public Bullet fire(BulletObjectPool bulletObjectPool) {
        // TODO the direction should be a vector pointing to the target
        Bullet b = bulletObjectPool.checkOut(new BulletObjectPool.BulletDto(getX(), getY(), 10));
        MoveBulletAbstractStrategy strategy = getMoveBulletFactory().getPool().checkOut(new MoveBulletStrategyObjectPool.MoveBulletStrategyDto(1, 1, b, getMoveBulletFactory()));
        b.setMoveBulletStrategy(strategy);
        return b;
    }
}
