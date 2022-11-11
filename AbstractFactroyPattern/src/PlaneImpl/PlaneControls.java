package PlaneImpl;

import interfacePack.Controls;

public class PlaneControls implements Controls {
    @Override
    public void steerRight() {
        System.out.println("Plane steer right");
    }

    @Override
    public void steerLeft() {
        System.out.println("Plane steer left.");
    }
}
