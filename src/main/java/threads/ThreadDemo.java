package threads;


import java.util.concurrent.locks.ReentrantLock;


public class ThreadDemo {
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadEntity thread = new ThreadEntity();
        test(thread);

        Thread thread1 = new Thread();
        thread1.setDaemon(true);
        thread1.start();

        System.out.println();
    }

    public static void test(ThreadEntity entity) {
        System.out.println(entity);
        test1(2);

    }

    public static void test1(int value) {
        test1(2);
    }
}
