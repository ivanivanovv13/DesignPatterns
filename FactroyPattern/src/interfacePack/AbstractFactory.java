package interfacePack;

public interface AbstractFactory {
    Transportation createTransportation();

    Engine crateEngine();

    Controls createControl();
}
