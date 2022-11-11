public class CDBuilder implements Builder {
    private String type;
    private String name;
    private double price;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public CD getPacking() {
        return new CD(type, name, price);
    }
}
