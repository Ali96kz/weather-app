import threads.Thread1Runnable;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        Thread thread = new Thread(new Thread1Runnable("asd", null));
        thread.start();

        List<String> s = new ArrayList<>();

        while (true) {
            s.add(new String("asd"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
