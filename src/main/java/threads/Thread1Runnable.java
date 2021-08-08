package threads;

public class Thread1Runnable implements Runnable {

    private final String name;
    private final ThreadEntity entity;

    public Thread1Runnable(String name, ThreadEntity entity) {
        this.name = name;
        this.entity = entity;
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                wait();

                for (int i = 0; i < 100_000; i++) {
                    System.out.println(name + " " + entity.geta());
                    entity.incrementA();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
