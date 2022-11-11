package PlaneImpl;

import interfacePack.AbstractFactory;
import interfacePack.Controls;
import interfacePack.Engine;
import interfacePack.Transportation;

public class PlaneFactory implements AbstractFactory {
    @Override
    public Transportation createTransportation() {
        return new PlaneTransportation();
    }

    @Override
    public Engine crateEngine() {
        return new PlaneEngine();
    }

    @Override
    public Controls createControl() {
        return new PlaneControls();
    }
}
