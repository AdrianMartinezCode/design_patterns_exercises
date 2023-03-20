package exercise5_pool_factory_strategy;

public interface EnemyShipFactory {

    EnemyShip createEnemyShip(int x, int y, MoveBulletFactory moveBulletFactory);
}
