package exercise5_pool_factory_strategy;

public class MoveBulletFactoryZigZag implements MoveBulletFactory {

    private MoveBulletStrategyObjectPool pool;

    public MoveBulletFactoryZigZag(MoveBulletStrategyObjectPool pool) {
        this.pool = pool;
    }

    @Override
    public MoveBulletAbstractStrategy getStrategy(int vectY, int vectX, ParentAlive parentAlive) {
        return new ZigZagMoveStrategy(vectY, vectX, parentAlive);
    }

    @Override
    public MoveBulletStrategyObjectPool getPool() {
        return null;
    }
}
