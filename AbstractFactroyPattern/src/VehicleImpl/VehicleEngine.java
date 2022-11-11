package VehicleImpl;

import interfacePack.Engine;

public class VehicleEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("Vehicle engine ON.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Vehicle engine OFF.");
    }
}
