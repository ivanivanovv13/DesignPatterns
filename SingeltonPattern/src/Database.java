public class Database {

    private static Database instance;
    private String instanceName;

    private Database(String instanceName) {
        this.instanceName = instanceName;
    }

    public static Database getInstance(String instanceName) {
        if (instance == null) {
            instance = new Database(instanceName);
        }
        return instance;
    }

    public void printInstanceName() {
        if (instanceName != null) {
            System.out.println(instanceName);
        }
    }
}
