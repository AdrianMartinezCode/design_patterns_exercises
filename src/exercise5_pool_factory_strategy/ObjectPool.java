package exercise5_pool_factory_strategy;

import java.util.*;

public abstract class ObjectPool<T, DTO> {

    private long expirationTime;

    private Hashtable<T, Long> locked, unlocked;

    public ObjectPool() {
        this(30000);
    }

    public ObjectPool(long expirationTime) {
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
        this.expirationTime = expirationTime;
    }

    public synchronized T checkOut(DTO dto) {
        long now = System.currentTimeMillis();
        T b;
        if (!unlocked.isEmpty()) {
            Enumeration<T> e = unlocked.keys();
            while(e.hasMoreElements()) {
                b = e.nextElement();
                if (!isAlive(b) && (now - unlocked.get(b)) > expirationTime) {
                    unlocked.remove(b);
                    expire(b);
                    b = null;
                } else if (!isAlive(b)) {
                    unlocked.remove(b);
                    prepare(b, dto);
                    locked.put(b, now);
                    return b;
                } else {
                    // does not have sense that any object is not expired, is alive and it is in the unlocked dic
                    unlocked.remove(b);
                    expire(b);
                    b = null;
                }
            }
        }
        b = create(dto);
        locked.put(b, now);
        return b;
    }

    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }


    protected abstract boolean isAlive(T b);
    protected abstract void prepare(T b, DTO dto);
    protected abstract T create(DTO dto);
    protected abstract void expire(T b);

}
