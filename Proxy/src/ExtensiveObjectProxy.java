public class ExtensiveObjectProxy implements ExtensiveObject {
    private static ExtensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExtensiveObjectImpl();
        }
        object.process();
    }
}
