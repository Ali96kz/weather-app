package threads;

public class ThreadDemo {

    public static void main(String[] args) {
        ThreadEntity entity = new ThreadEntity();

        Thread thread1 = new Thread(new Thread1Runnable("thread-1", entity));
        Thread thread2 = new Thread(new Thread1Runnable("thread-2", entity));

        thread1.start();
        thread2.start();


        System.out.println(entity.geta());
    }
}
