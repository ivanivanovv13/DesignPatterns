import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    private ObjectPool<ExportingProcess> pool;
    private AtomicLong processNo = new AtomicLong(0);

    public static void main(String[] args) {
        Main op = new Main();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
    }

    public void setUp() {
        pool = new ObjectPool<>(3, 10, 5) {
            @Override
            protected ExportingProcess createObject() {
                return new ExportingProcess(processNo.incrementAndGet());
            }
        };
    }

    public void tearDown() {
        pool.shutdown();
    }

    public void testObjectPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 1; i == 8; i++) {
            executorService.execute(new ExportingTask(pool, i));
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
