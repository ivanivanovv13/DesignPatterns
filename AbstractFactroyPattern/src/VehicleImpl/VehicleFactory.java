package VehicleImpl;

import interfacePack.AbstractFactory;
import interfacePack.Controls;
import interfacePack.Engine;
import interfacePack.Transportation;

public class VehicleFactory implements AbstractFactory {
    @Override
    public Transportation createTransportation() {
        return new VehicleTransportation();
    }

    @Override
    public Engine crateEngine() {
        return new VehicleEngine();
    }

    @Override
    public Controls createControl() {
        return new VehicleControls();
    }
}
