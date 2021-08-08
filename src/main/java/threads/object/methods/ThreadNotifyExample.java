package threads.object.methods;

public class ThreadNotifyExample {

    public void test() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void test2() {
        notifyAll();
    }
}
