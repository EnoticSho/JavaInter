import java.util.concurrent.locks.ReentrantLock;

public class CounterThread implements Runnable {

    private final Counter counter;
    private final ReentrantLock lock;

    public CounterThread(Counter counter, ReentrantLock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), counter.getCounter());
            counter.increase();
        }
        lock.unlock();
    }
}
