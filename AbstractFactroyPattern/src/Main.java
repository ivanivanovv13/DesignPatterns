import PlaneImpl.PlaneFactory;
import VehicleImpl.VehicleFactory;
import interfacePack.AbstractFactory;
import interfacePack.Controls;
import interfacePack.Engine;
import interfacePack.Transportation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractFactory> abstractFactory = new ArrayList<>();
        List<Engine> engines = new ArrayList<>();
        List<Transportation> transportations = new ArrayList<>();
        List<Controls> controls = new ArrayList<>();

        abstractFactory.add(new PlaneFactory());
        abstractFactory.add(new VehicleFactory());

        abstractFactory.forEach(factory -> {
            engines.add(factory.crateEngine());
            transportations.add(factory.createTransportation());
            controls.add(factory.createControl());
        });

        transportations.forEach(Transportation::getTransportationType);
        engines.forEach(Engine::startEngine);
        controls.forEach(Controls::steerRight);
        controls.forEach(Controls::steerLeft);
        engines.forEach(Engine::stopEngine);

    }
}