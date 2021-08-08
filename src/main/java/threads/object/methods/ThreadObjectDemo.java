package threads.object.methods;

import threads.Thread1Runnable;
import threads.ThreadEntity;

public class ThreadObjectDemo {

    public static void main(String[] args) throws InterruptedException {
        ThreadEntity entity = new ThreadEntity();
        ThreadNotifyExample threadNotifyExample = new ThreadNotifyExample();
        Thread thread = new Thread(() -> {
            threadNotifyExample.test();

        });
        Thread thread1 = new Thread(() ->{
            threadNotifyExample.test2();
        });


        thread1.start();
        thread.start();
    }
}
