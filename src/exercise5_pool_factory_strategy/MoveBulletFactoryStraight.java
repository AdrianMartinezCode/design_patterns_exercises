package exercise5_pool_factory_strategy;

public class MoveBulletFactoryStraight implements MoveBulletFactory {

    private MoveBulletStrategyObjectPool moveBulletStrategyObjectPool;

    public MoveBulletFactoryStraight(MoveBulletStrategyObjectPool moveBulletStrategyObjectPool) {
        this.moveBulletStrategyObjectPool = moveBulletStrategyObjectPool;
    }

    @Override
    public MoveBulletAbstractStrategy getStrategy(int vectY, int vectX, ParentAlive parentAlive) {
        return new StraightMoveStrategy(vectY, vectX, parentAlive);
    }

    @Override
    public MoveBulletStrategyObjectPool getPool() {
        return moveBulletStrategyObjectPool;
    }
}
