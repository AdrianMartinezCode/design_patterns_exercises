package exercise5_pool_factory_strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scenario {

    private EnemyShipFactoryGiga enemyShipFactoryGiga;
    private ShipObjectPool shipObjectPoolGiga;

    private EnemyShipFactoryOrdinary enemyShipFactoryOrdinary;
    private ShipObjectPool shipObjectPoolOrdinary;

    private MoveBulletFactoryStraight moveBulletFactoryStraight;
    private MoveBulletStrategyObjectPool moveBulletStrategyObjectPoolStraight;

    private MoveBulletFactoryZigZag moveBulletFactoryZigZag;
    private MoveBulletStrategyObjectPool moveBulletStrategyObjectPoolZigZag;

    private List<Bullet> bullets;
    private BulletObjectPool bulletObjectPool;


    private List<EnemyShip> enemies;

    public void game() {
        // TODO make the pools more unified to be able to checkin in one operation

        enemyShipFactoryGiga = new EnemyShipFactoryGiga();
        shipObjectPoolGiga = new ShipObjectPool(enemyShipFactoryGiga);

        enemyShipFactoryOrdinary = new EnemyShipFactoryOrdinary();
        shipObjectPoolOrdinary = new ShipObjectPool(enemyShipFactoryOrdinary);

        moveBulletStrategyObjectPoolStraight = new MoveBulletStrategyObjectPool();
        moveBulletFactoryStraight = new MoveBulletFactoryStraight(moveBulletStrategyObjectPoolStraight);

        moveBulletStrategyObjectPoolZigZag = new MoveBulletStrategyObjectPool();
        moveBulletFactoryZigZag = new MoveBulletFactoryZigZag(moveBulletStrategyObjectPoolZigZag);


        bullets = new ArrayList<>();
        bulletObjectPool = new BulletObjectPool();

        enemies = Arrays.asList(
            shipObjectPoolGiga.checkOut(new ShipObjectPool.EnemyShipDto(1, 2, moveBulletFactoryStraight)),
            shipObjectPoolGiga.checkOut(new ShipObjectPool.EnemyShipDto(1, 3, moveBulletFactoryZigZag)),
            shipObjectPoolOrdinary.checkOut(new ShipObjectPool.EnemyShipDto(2, 4, moveBulletFactoryStraight))
        );

        while(true) {
            nextTurn();
            // moveParticlesAndProcessCollides();
            recycleDiedObjects(); // <-- this only clear the reference inside this Scenario class, not on the pools, the
                                  // pools are the last responsible to maintain the copies of the objects
        }


    }

    void nextTurn() {
        enemies.forEach(e -> {
            bullets.add(e.fire(bulletObjectPool));
        });
    }

    void recycleDiedObjects() {
        ArrayList<EnemyShip> enemiesToDelete = new ArrayList<>();
        for (EnemyShip enemy : enemies) {
            if (!enemy.isAlive()) enemiesToDelete.add(enemy);
        }
        for (EnemyShip e : enemiesToDelete) {
            enemies.remove(e);
            shipObjectPoolGiga.checkIn(e);
            shipObjectPoolOrdinary.checkIn(e);
        }

        ArrayList<Bullet> bulletsToDelete = new ArrayList<>();
        for (Bullet bullet : bullets) {
            if (!bullet.isAlive()) bulletsToDelete.add(bullet);
        }
        for (Bullet e : bulletsToDelete) {
            bullets.remove(e);
            bulletObjectPool.checkIn(e);
            // TODO fix that.
            moveBulletStrategyObjectPoolZigZag.checkIn(e.getMoveBulletStrategy());
            moveBulletStrategyObjectPoolStraight.checkIn(e.getMoveBulletStrategy());
        }
    }


}
