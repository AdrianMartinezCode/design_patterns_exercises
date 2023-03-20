package exercise5_pool_factory_strategy;

public class EnemyShipFactoryGiga implements EnemyShipFactory{
    @Override
    public EnemyShip createEnemyShip(int x, int y, MoveBulletFactory moveBulletFactory) {
        return new GigaEnemyShip(x, y, moveBulletFactory);
    }
}
