import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSimple {

    private Integer a;
    private volatile int b;

    public int geta() {
        synchronized (a) {

        }
        return a;
    }

    public synchronized void incrementA() {
        a++;
    }
}
