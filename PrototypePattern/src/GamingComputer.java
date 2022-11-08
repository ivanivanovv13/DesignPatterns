public class GamingComputer extends Computer {
    public GamingComputer(GamingComputer computer) {
        super(computer);
    }

    public GamingComputer() {
    }

    @Override
    public Computer clone() {
        return new GamingComputer(this);
    }
}
