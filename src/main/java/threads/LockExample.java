package threads;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private ReentrantLock reentrantLock = new ReentrantLock();

    public  void update(List<Object> objectList) {
        reentrantLock.lock();
        try {
            System.out.println();
        } catch (Exception e) {
            throw new IllegalAccessError();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void getAll() {
        reentrantLock.lock();
        try {
            System.out.println();
        } catch (Exception e) {
            throw new IllegalAccessError();
        } finally {
            reentrantLock.unlock();
        }
    }
}
