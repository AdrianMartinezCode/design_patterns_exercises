package exercise5_pool_factory_strategy;

public class ShipObjectPool extends ObjectPool<EnemyShip, ShipObjectPool.EnemyShipDto> {

    private EnemyShipFactory enemyShipFactory;

    public ShipObjectPool(EnemyShipFactory enemyShipFactory) {
        this.enemyShipFactory = enemyShipFactory;
    }

    @Override
    protected boolean isAlive(EnemyShip b) {
        return b.isAlive();
    }

    @Override
    protected void prepare(EnemyShip b, EnemyShipDto enemyShipDto) {
        b.setX(enemyShipDto.x);
        b.setY(enemyShipDto.y);
        b.resetLifePoints();
        b.setMoveBulletFactory(enemyShipDto.moveBulletFactory);
    }

    @Override
    protected EnemyShip create(EnemyShipDto enemyShipDto) {
        return enemyShipFactory.createEnemyShip(enemyShipDto.x, enemyShipDto.y, enemyShipDto.moveBulletFactory);
    }

    @Override
    protected void expire(EnemyShip b) {

    }


    public static class EnemyShipDto {
        private int x;
        private int y;
        private MoveBulletFactory moveBulletFactory;

        public EnemyShipDto(int x, int y, MoveBulletFactory moveBulletFactory) {
            this.x = x;
            this.y = y;
            this.moveBulletFactory = moveBulletFactory;
        }
    }
}
