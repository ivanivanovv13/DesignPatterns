public class ExportingTask implements Runnable {
    private ObjectPool<ExportingProcess> pool;
    private int treadNO;

    public ExportingTask(ObjectPool<ExportingProcess> pool, int treadNO) {
        this.pool = pool;
        this.treadNO = treadNO;
    }

    @Override
    public void run() {
        ExportingProcess exportingProcess = pool.borrowObject();
        System.out.println("Thread " + treadNO + ":Object with process no." + exportingProcess.getProcessNo() + " was borrowed");

        pool.returnObject(exportingProcess);
        System.out.println("Thread " + treadNO + ":Object with process no." + exportingProcess.getProcessNo() + " was returned");
    }
}
