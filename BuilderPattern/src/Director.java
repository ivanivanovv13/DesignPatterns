public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public Packing makePacking() {

        return builder.getPacking();
    }
}
