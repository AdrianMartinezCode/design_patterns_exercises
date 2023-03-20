package exercise5_pool_factory_strategy;

public interface MoveBulletFactory {

    MoveBulletAbstractStrategy getStrategy(int vectY, int vectX, ParentAlive parentAlive);
    MoveBulletStrategyObjectPool getPool();

}
