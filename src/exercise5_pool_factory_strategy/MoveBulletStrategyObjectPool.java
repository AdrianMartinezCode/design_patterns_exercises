package exercise5_pool_factory_strategy;

public class MoveBulletStrategyObjectPool extends ObjectPool<MoveBulletAbstractStrategy, MoveBulletStrategyObjectPool.MoveBulletStrategyDto> {


    @Override
    protected boolean isAlive(MoveBulletAbstractStrategy b) {
        return b.isAlive();
    }

    @Override
    protected void prepare(MoveBulletAbstractStrategy b, MoveBulletStrategyDto moveBulletStrategyDto) {
        b.setVectX(moveBulletStrategyDto.vecX);
        b.setVectY(moveBulletStrategyDto.vecY);
        b.setParentAlive(moveBulletStrategyDto.parentAlive);
        b.expireStrategy();
    }

    @Override
    protected MoveBulletAbstractStrategy create(MoveBulletStrategyDto moveBulletStrategyDto) {
        return moveBulletStrategyDto.moveBulletFactory.getStrategy(moveBulletStrategyDto.vecY, moveBulletStrategyDto.vecX, moveBulletStrategyDto.parentAlive);
    }

    @Override
    protected void expire(MoveBulletAbstractStrategy b) {
        b.expireStrategy();
    }

    public static class MoveBulletStrategyDto {
        private int vecX;
        private int vecY;

        private ParentAlive parentAlive;

        private MoveBulletFactory moveBulletFactory;

        public MoveBulletStrategyDto(int vecX, int vecY, ParentAlive parentAlive, MoveBulletFactory moveBulletFactory) {
            this.vecX = vecX;
            this.vecY = vecY;
            this.parentAlive = parentAlive;
            this.moveBulletFactory = moveBulletFactory;
        }
    }
}
