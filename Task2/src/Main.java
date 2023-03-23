import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new CounterThread(counter, lock));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}
