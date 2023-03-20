package exercise5_pool_factory_strategy;

public class ZigZagMoveStrategy extends MoveBulletAbstractStrategy {

    private int vectYPerpendicular;
    private int vectXPerpendicular;

    private boolean straight;
    private boolean returning; // this indicates that we should apply the return movement from the zigzag origin
    /*
           |
       <--       <-- represents that move if returning = false && straight = false
       |
       -->       <-- represents that move if returning = true && straight = false
          |
     */

    public ZigZagMoveStrategy(int vectY, int vectX, ParentAlive parentAlive) {
        super(vectY, vectX, parentAlive);
        expireStrategy();
        // Calculate the perpendicular vector to make the zigzag effect
        this.vectXPerpendicular = -vectX;
        this.vectYPerpendicular = vectY;
    }

    @Override
    public void moveBullet(Bullet bullet) {
        if (straight) {
            bullet.setX(getVectX() * bullet.getX());
            bullet.setY(getVectY() * bullet.getY());
        } else {
            if (returning) {
                bullet.setX((-1*vectXPerpendicular) * bullet.getX());
                bullet.setY((-1*vectYPerpendicular) * bullet.getY());
            } else {
                bullet.setX(vectXPerpendicular * bullet.getX());
                bullet.setY(vectYPerpendicular * bullet.getY());
            }
            returning = !returning;
        }
        straight = !straight;
    }

    @Override
    public void expireStrategy() {
        straight = true;
        returning = false;
    }
}
