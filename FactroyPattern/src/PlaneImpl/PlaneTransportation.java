package PlaneImpl;

import interfacePack.Transportation;

public class PlaneTransportation implements Transportation {
    @Override
    public void getTransportationType() {
        System.out.println("Type of transportation - Plane.");
    }
}
