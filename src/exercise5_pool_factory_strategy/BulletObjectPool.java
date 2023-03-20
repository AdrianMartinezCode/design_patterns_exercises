package exercise5_pool_factory_strategy;

public class BulletObjectPool extends ObjectPool<Bullet, BulletObjectPool.BulletDto> {

    @Override
    protected boolean isAlive(Bullet b) {
        return b.isAlive();
    }

    @Override
    protected void prepare(Bullet b, BulletDto bulletDto) {
        b.restart();
        b.setX(bulletDto.x);
        b.setY(bulletDto.y);
        b.setDamage(bulletDto.damage);
        //b.setMoveBulletStrategy(bulletDto.moveBulletStrategy);
    }

    @Override
    protected Bullet create(BulletDto bulletDto) {
        return bulletDto.toBullet();
    }

    @Override
    protected void expire(Bullet b) {
        b.getMoveBulletStrategy().expireStrategy();
    }

    public static class BulletDto {
        private int x;
        private int y;
        private int damage;
        //private MoveBulletStrategy moveBulletStrategy;

        // TODO due we have an inverse dependency, we should initialize the strategy later on the moment of the bullet using
        public BulletDto(int x, int y, int damage/*, MoveBulletStrategy moveBulletStrategy*/) {
            this.x = x;
            this.y = y;
            this.damage = damage;
            //this.moveBulletStrategy = moveBulletStrategy;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDamage() {
            return damage;
        }

       /* public MoveBulletStrategy getMoveBulletStrategy() {
            return moveBulletStrategy;
        }*/

        public Bullet toBullet() {
            return new Bullet(
                    x, y, damage//, moveBulletStrategy
            );
        }
    }
}
