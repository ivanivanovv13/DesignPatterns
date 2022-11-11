package VehicleImpl;

import interfacePack.Controls;

public class VehicleControls implements Controls {
    @Override
    public void steerRight() {
        System.out.println("Vehicle steer right.");
    }

    @Override
    public void steerLeft() {
        System.out.println("Vehicle steer left.");
    }
}
