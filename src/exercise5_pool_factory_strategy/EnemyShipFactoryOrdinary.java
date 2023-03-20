package exercise5_pool_factory_strategy;

public class EnemyShipFactoryOrdinary implements EnemyShipFactory {
    @Override
    public EnemyShip createEnemyShip(int x, int y, MoveBulletFactory moveBulletFactory) {
        return new OrdinaryEnemyShip(x, y, moveBulletFactory);
    }
}
