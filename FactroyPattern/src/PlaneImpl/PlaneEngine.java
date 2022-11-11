package PlaneImpl;

import interfacePack.Engine;

public class PlaneEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Plane engine is ON");
    }

    @Override
    public void stopEngine() {
        System.out.println("Plane engine is OFF");
    }
}
